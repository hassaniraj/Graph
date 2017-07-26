package com.legenday.graph;

/***
 * Creates a graph 
 *
 */
public class Graph {
	
	/**
	 * Adds an edge in the graph
	 * @param from
	 * @param to
	 * @param adj
	 */
	public void addEdge(int from, int to, int[][] adj) {
		adj[from][to] = 1;
	}
	
	/**
	 * Finds a reach of the vertices
	 * @param nodes
	 * @param edges
	 * @return int[] reach count for each vertex
	 */
	public int[] findReach(int nodes, int[][] edges) {
		int[][] adjacencyMatrix = setGraph(nodes, edges);
		int[][] path = adjacencyMatrix;
		for (int through = 0; through < nodes; through++) {
			for (int i = 0; i < nodes; i++) {
				for (int j = 0; j < nodes; j++) {
					path[i][j] = ((path[i][j] != 0) || (path[i][through] != 0 && path[through][j] != 0)) ? 1 : 0;
				}
			}
		}
		return getVerticeCount(path);
	}
	
	/**
	 * Get the count of the reach for each vertice
	 * @param reach
	 * @return int[] vertex count with reachability
	 */
	private int[] getVerticeCount(int[][] reach){
		int[] vertexReach = new int[reach.length];
		for(int i=0;i<reach.length;i++){
			for(int j=0;j<reach.length;j++){
				vertexReach[i]+=reach[i][j];
			}
		}
		return vertexReach;
	}
	
	/**
	 * Creates a adjacency matrix for the graph
	 * @param nodes
	 * @param edges
	 * @return int[][] matrix for the edges in the graph
	 */
	public int[][] setGraph(int nodes, int[][] edges){
		int[][] adj = new int[nodes][nodes];
		for(int i=0;i<edges.length;i++){
			addEdge(edges[i][0], edges[i][1], adj);
		}
		return adj;
	}

	/**
	 * Prints the graph
	 * @param adj
	 */
	public void printGraph(int[][] adj) {
		for (int i = 0; i < adj.length; i++) {
			for (int j = 0; j < adj[0].length; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}

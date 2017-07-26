Create a class GraphNodes with a method findReach that takes an int nodes representing the number of nodes in the graph and an int[][] edges that describes the paths of each edge for a given graph (each edge is represented by indexes of two nodes [from, to]). This method returns an int[] of length nodes with each value in the array representing the number of nodes that can be reached beginning at that node by any number of traversals of edges in the graph. A node A reaches another node B if a path made up of at least one edge can be constructed to connect A to B. Paths may be arbitrarily long. Nodes may not be considered to automatically "reach" themselves.

Definition
    	
Class:	GraphNodes
Method:	findReach
Parameters:	int, int[][]
Returns:	int[]
Method signature:	int[] findReach(int nodes, int[][] edges)
 
Constraints
- nodes will be a positive integer.
-	Each element of edges will be an array of length 2.Values in this array will be between 0 and nodes-1 (representing the index of the node).
 
Examples

0.

2
{{0, 1}}

Returns: {1, 0}

A single edge points from node 0 to node 1. Node 0 can therefore reach a single node.

1.

2
{{0, 0}, {0, 1}, {1, 1}}
    	
Returns: {2, 1}

As above but each node can additionally reach itself due to cyclic edges.

2.
    	
5
{{0, 2}, {1, 3}, {2, 4}, {3, 0}, {4, 1}}

Returns: {5, 5, 5, 5, 5}

Star-shaped graph. All nodes can reach all nodes.

3)	

7
{{0, 1}, {1, 3}, {1, 6}, {2, 3}, {3, 4}, {4, 5}, {5, 4}, {6, 0}}

Returns: {6, 6, 3, 2, 2, 2, 6}

package com.legendary.graph;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.legenday.graph.Graph;

/***
 * Performs the tests for the graph
 *
 */
public class GraphTests {
	private static int[] RESULT_TEST_CASE1 = new int[] { 6, 6, 3, 2, 2, 2, 6 };
	private static int[] RESULT_TEST_CASE2 = new int[] { 5, 5, 5, 5, 5 };
	private static int[] RESULT_TEST_CASE3 = new int[] { 2, 1 };
	private static int[] RESULT_TEST_CASE4 = new int[] { 1, 0 };
	private static Graph g;

	@BeforeClass
	public static void setUpBeforeClass() {
		g = new Graph();
	}

	@Test
	public void testReachability1() {
		int[][] edges = new int[][] { { 0, 1 }, { 1, 3 }, { 1, 6 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 4 }, { 6, 0 } };
		Assert.assertArrayEquals("Expected Array doesn't match ", RESULT_TEST_CASE1, g.findReach(7, edges));

	}

	@Test
	public void testReachability2() {
		int[][] edges = new int[][] { { 0, 2 }, { 1, 3 }, { 2, 4 }, { 3, 0 }, { 4, 1 } };
		Assert.assertArrayEquals("Expected Array doesn't match ", RESULT_TEST_CASE2, g.findReach(5, edges));

	}

	@Test
	public void testReachability3() {
		int[][] edges = new int[][] { { 0, 0 }, { 0, 1 }, { 1, 1 } };
		Assert.assertArrayEquals("Expected Array doesn't match ", RESULT_TEST_CASE3, g.findReach(2, edges));

	}

	@Test
	public void testReachability4() {
		int[][] edges = new int[][] { { 0, 1 } };
		Assert.assertArrayEquals("Expected Array doesn't match ", RESULT_TEST_CASE4, g.findReach(2, edges));

	}
}

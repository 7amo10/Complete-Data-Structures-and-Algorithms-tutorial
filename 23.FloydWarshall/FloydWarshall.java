import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class FloydWarshall {

	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	// Constructor
	public FloydWarshall(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	void dijkstra(WeightedNode node) {
		PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
		node.distance = 0;
		queue.addAll(nodeList);
		while (!queue.isEmpty()) {
			WeightedNode currentNode = queue.remove();
			for (WeightedNode neighbor : currentNode.neighbors) {
				if (queue.contains(neighbor)) {
					if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
						neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
						neighbor.parent = currentNode;
						queue.remove(neighbor);
						queue.add(neighbor);
					}
				}
			}
		}

		for (WeightedNode nodeToCheck : nodeList) {
			System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
	}

	public static void pathPrint(WeightedNode node) {
		if (node.parent != null) {
			pathPrint(node.parent);
		}
		System.out.print(node.name + " ");
	}

	// Bellman Ford Algorithm
	void bellmanFord(WeightedNode sourceNode) {
		sourceNode.distance = 0;
		for (int i = 0; i < nodeList.size(); i++) {
			for (WeightedNode currentNode : nodeList) {
				for (WeightedNode neighbor : currentNode.neighbors) {
					if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
						neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
						neighbor.parent = currentNode;
					}
				}
			}
		}
		System.out.println("Checking for Negative Cycle..");
		for (WeightedNode currentNode : nodeList) {
			for (WeightedNode neighbor : currentNode.neighbors) {
				if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
					System.out.println("Negative cycle found: \n");
					System.out.println("Vertex name: " + neighbor.name);
					System.out.println("Old cost: " + neighbor.distance);
					int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
					System.out.println("new cost: " + newDistance);
					return;
				}
			}
		}
		System.out.println("Negative Cycle not found");

		for (WeightedNode nodeToCheck : nodeList) {
			System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
	}

	void floydWarshall() {
		int size = nodeList.size();
		int[][] V = new int[size][size];

		// Initializing Distance table from adjacency list
		for (int i = 0; i < size; i++) {
			WeightedNode first = nodeList.get(i);
			for (int j = 0; j < size; j++) {
				WeightedNode second = nodeList.get(j);
				if (i == j)
					V[i][j] = 0;
				else if (first.getWeightMap().containsKey(second)) { // we have direct edge between i & j
					V[i][j] = first.getWeightMap().get(second);
				} else { // no direct edge between i & j, so mark it as infinity [divided by 10 to avoid
							// arithmetic overflow]
					V[i][j] = Integer.MAX_VALUE / 10;
				}
			}
		} // end of loop

		// Floyd Warshall's Algorithm
		for (int k = 0; k < nodeList.size(); k++) {
			for (int i = 0; i < nodeList.size(); i++) {
				for (int j = 0; j < nodeList.size(); j++) {
					if (V[i][j] > V[i][k] + V[k][j]) { // if update possible, then update path
						V[i][j] = V[i][k] + V[k][j]; // this will keep a track on path
					}
				}
			}
		} // end of loop

		// Print table of node with minimum distance and shortest path from each source
		for (int i = 0; i < size; i++) {
			System.out.print("Printing distance list for node " + nodeList.get(i) + ": ");
			for (int j = 0; j < size; j++) {
				System.out.print(V[i][j] + " ");
			}
			System.out.println();
		}

	}// end of method

	// add a weighted edge between two nodes
	public void addWeightedEdge(int i, int j, int d) {
		WeightedNode first = nodeList.get(i - 1);
		WeightedNode second = nodeList.get(j - 1);
		first.getNeighbors().add(second);
		first.getWeightMap().put(second, d);
	}// end of method

}// end of class

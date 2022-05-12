package name.guolanren._101to200._131to140.p133;

import java.util.*;

/**
 * @link https://leetcode.com/problems/clone-graph/
 * @author guolanren
 */
public class CloneGraph {

    Map<Integer, Node> cloneNodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node cloneNode = new Node(node.val);
        cloneNodes.put(node.val, cloneNode);

        ArrayList<Node> cloneNeighbors = new ArrayList<>();
        for (Node neighbor : node.neighbors) {
            if (cloneNodes.containsKey(neighbor.val)) {
                cloneNeighbors.add(cloneNodes.get(neighbor.val));
            } else {
                cloneNeighbors.add(cloneGraph(neighbor));
            }
        }
        cloneNode.neighbors = cloneNeighbors;
        return cloneNode;
    }

}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
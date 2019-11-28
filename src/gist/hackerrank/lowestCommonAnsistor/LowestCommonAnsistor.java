package gist.hackerrank.lowestCommonAnsistor;

public class LowestCommonAnsistor {
    public  Node lca(Node root, int v1, int v2) {

        // Write your code here.
        return dfs(root, v1,v2);
    }

    private Node dfs(Node node, int v1, int v2) {
        if(node == null){
            return null;
        }
        if(node.data < v1 && node.data < v2 ){
            return dfs(node.left, v1, v2);
        }
        if(node.data > v1 && node.data > v2 ) {
            return dfs(node.right, v1, v2);
        }

        return node;

    }


}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

package tree;

import java.util.PriorityQueue;

public class Tree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        PriorityQueue<TreeNode> nodes = new PriorityQueue<>();
        nodes.add(cloned);


        while(nodes.peek() != null){
            TreeNode targetNode = nodes.peek();
            if(targetNode == target){
                return targetNode;
            }
            if(targetNode.left != null){
                nodes.add(targetNode.left);
            }
            if (targetNode.right != null){
                nodes.add(targetNode.right);
            }
            nodes.poll();
        }
        return null;
    }

    public static void queue(){

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}

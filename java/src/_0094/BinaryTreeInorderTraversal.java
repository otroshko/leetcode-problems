package _0094;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !s.empty()) {
            while (currentNode != null) {
                s.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = s.pop();
            result.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return result;
    }

    public List<Integer> inorderTraversalOldWithRecursion(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    private void inorderRecursive(TreeNode currentNode, List<Integer> result) {
        if(currentNode == null) {
            return;
        }

        inorderRecursive(currentNode.left, result);
        result.add(currentNode.val);
        inorderRecursive(currentNode.right, result);
    }
}

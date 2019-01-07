package _0094;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeInorderTraversalTest {
    private BinaryTreeInorderTraversal _solution = new BinaryTreeInorderTraversal();

    @Test
    public void test() {
        // Arrange
        List<Integer> expectedResult = List.of(1, 3, 2);
        var root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Act
        List<Integer> actualResult = _solution.inorderTraversal(root);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
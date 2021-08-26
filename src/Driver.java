import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        BinaryTree binaryTreeObject = new BinaryTree();
        TreeNode startNode = null;

        startNode = binaryTreeObject.insert(startNode, 7, "seven");
        startNode = binaryTreeObject.insert(startNode, 10, "ten");
        startNode = binaryTreeObject.insert(startNode, 5, "five");

        startNode = binaryTreeObject.insert(startNode, 4, "four");
        startNode = binaryTreeObject.insert(startNode, 6, "six");
        startNode = binaryTreeObject.insert(startNode, 8, "eight");

        startNode = binaryTreeObject.insert(startNode, 11, "eleven");

        List<String> resultArray = new ArrayList<>();
        BinaryTree.TreeTraversal(startNode,resultArray);

        resultArray.forEach(System.out::println);

        binaryTreeObject.NoRecursionTraversal(startNode);
    }
}

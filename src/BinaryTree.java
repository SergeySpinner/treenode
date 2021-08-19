import java.util.List;

public class BinaryTree {
    private TreeNode NewNode(int key, String temp) {
        TreeNode newNode = new TreeNode();
        newNode.value = temp;
        newNode.key = key;
        newNode.left = newNode.right = null;
        return newNode;
    }

    public TreeNode insert(TreeNode node, int key, String temp) {
        if (node == null) {
            return NewNode(key, temp);
        }
        if (key < node.key) {
            node.left = insert(node.left, key, temp);
        } else if (key > node.key) {
            node.right = insert(node.right, key, temp);
        }

        return node;
    }
    
    static public void TreeTraversal(TreeNode node, List<String> arrayToFill){
        if(node != null){
            TreeTraversal(node.left, arrayToFill);
            arrayToFill.add(node.value);
            TreeTraversal(node.right, arrayToFill);
        }
    }

}

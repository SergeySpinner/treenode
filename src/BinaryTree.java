public class BinaryTree {
    public TreeNode NewNode(int k, String temp) {
        TreeNode newNode = new TreeNode();
        newNode.value = temp;
        newNode.key = k;
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

}

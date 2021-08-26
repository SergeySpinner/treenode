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

    static public void NoRecursionTraversal(TreeNode root)
    {
        TreeNode current, previousNode;

        if (root == null)
            return;
        current = root;

        while (current != null)
        {
            if (current.left == null)
            {
                System.out.print(current.value + " ");
                current = current.right;
            }
            else {
                previousNode = current.left;
                while (previousNode.right != null
                        && previousNode.right != current)
                    previousNode = previousNode.right;
                if (previousNode.right == null) {
                    previousNode.right = current;
                    current = current.left;
                }
                else
                {
                    previousNode.right = null;
                    System.out.print(current.value + " ");
                    current = current.right;
                }
            }

        }
    }
}

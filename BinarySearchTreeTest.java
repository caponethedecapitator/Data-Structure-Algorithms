class BinarySearchTree
{
    private class Node
    {
        private int key;
        private Node left;
        private Node right;

        public Node(int key, Node left, Node right)
        {
            this.key = key;
            this.left = left;
            this.right = right;
        }

        public Node(int key)
        {
            this(key, null, null);
        }

        public Node()
        {
            this(0, null, null);
        }
    }

    private Node root = null;
    private int depth = 0;
    private int height = 0;

    public int getDepth()
    {
        return depth;
    }

    public int getHeight()
    {
        return height;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void insert(int key)
    {
        if (isEmpty())
        {
            this.root = new Node(key);
        }

        Node newNode = new Node(key);
        Node cur = this.root;

        while (cur != null)
        {
            if (key < cur.key)
            {

                if (cur.left == null)
                {
                    cur.left = newNode;
                }

                cur = cur.left;
            }

            if (key > cur.key)
            {
                if (cur.right == null)
                {
                    cur.right = newNode;
                }

                cur = cur.right;
            }

            if (key == cur.key)
            {
                return;
            }
        }

    }

    public Node get(int key)
    {
        Node cur = this.root;
        
        while (cur != null)
        {
            if (key == cur.key)
            {
                return cur;
            }
    
            else if (key < cur.key)
            {
                cur = cur.left;
            }
    
            else if (key > cur.key)
            {
                cur = cur.right;
            }
        }

        return null;
    }

    public Node peek()
    {
        return this.root;
    }

    public void preorder(Node root)
    {
        if (isEmpty())
        {
            System.out.println("No elements");
        }

        Node cur = root;

        if (cur == null)
        {
            return;
        }

        System.out.print(cur.key + " ");
        preorder(cur.left);
        preorder(cur.right);
    }
    
    public void inorder(Node root)
    {
        if (isEmpty())
        {
            System.out.println("No elements");
        }

        Node cur = root;
        
        if (cur == null)
        {
            return;
        }

        inorder(cur.left);
        System.out.print(cur.key + " ");
        inorder(cur.right);
    }

    public void postorder(Node root)
    {
        if (isEmpty())
        {
            System.out.println("No elements");
        }

        Node cur = root;
        
        if (cur == null)
        {
            return;
        }

        postorder(cur.left);
        postorder(cur.right);
        System.out.print(cur.key + " ");
    }
}

public class BinarySearchTreeTest 
{
    public static void main(String[] args)
    {
        BinarySearchTree BST = new BinarySearchTree();
    }
}

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
    void preOrder();

    void postOrder();
    boolean find(TreeNode<E> treeNode, E e);

    boolean remove(TreeNode<E> treeNode, E e);
}

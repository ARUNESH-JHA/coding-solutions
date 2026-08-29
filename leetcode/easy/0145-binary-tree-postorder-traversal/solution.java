
class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        postorder(root, list);

        return list;
    }

    public void postorder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        postorder(root.left, list);
        //list.add(root.val);
        postorder(root.right, list);
        list.add(root.val);
}}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                // First node of every level = rightmost node
                if (i == 0) {
                    ans.add(node.val);
                }

                // Right first
                if (node.right != null) {
                    q.offer(node.right);
                }

                // Then left
                if (node.left != null) {
                    q.offer(node.left);
                }
            }
        }

        return ans;
    }
}
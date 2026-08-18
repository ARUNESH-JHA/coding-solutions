class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int st_col = 0;
        int st_row = 0;

        int end_col = matrix[0].length - 1;
        int end_row = matrix.length - 1;

        List<Integer> list = new ArrayList<>();

        while (st_row <= end_row && st_col <= end_col) {

            // TOP
            for (int i = st_col; i <= end_col; i++) {
                list.add(matrix[st_row][i]);
            }

            // RIGHT
            for (int j = st_row + 1; j <= end_row; j++) {
                list.add(matrix[j][end_col]);
            }

            // BOTTOM
            if (st_row < end_row) {
                for (int k = end_col - 1; k >= st_col; k--) {
                    list.add(matrix[end_row][k]);
                }
            }

            // LEFT
            if (st_col < end_col) {
                for (int l = end_row - 1; l > st_row; l--) {
                    list.add(matrix[l][st_col]);
                }
            }

            st_row++;
            st_col++;
            end_row--;
            end_col--;
        }

        return list;
    }
}
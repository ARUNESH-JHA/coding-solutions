class Solution {
    public int countZeros(int[][] mat) {
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
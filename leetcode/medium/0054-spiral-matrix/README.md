# Spiral Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` `matrix`, return  *all elements of the*  `matrix`  *in spiral order*.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 44.34%)  
**Submitted:** 2026-08-18T17:16:59.119Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix/)
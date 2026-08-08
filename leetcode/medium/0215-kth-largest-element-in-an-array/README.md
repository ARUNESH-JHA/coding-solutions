# Kth Largest Element in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `kth`  *largest element in the array*.

Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

Can you solve it without sorting?

 

 **Example 1:** 

```
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

```

 **Example 2:** 

```
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

```

 

 **Constraints:** 

- 1 <= k <= nums.length <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-08-08T11:10:38.231Z  

```java
import java.util.Random;

class Solution {
    public int findKthLargest(int[] krishanu, int k) {
        int n = krishanu.length;
        int target = n - k; // index of kth largest in ascending sorted order
        return quickSelect(krishanu, 0, n - 1, target);
    }

    private int quickSelect(int[] krishanu, int left, int right, int target) {
        if (left == right) {
            return krishanu[left];
        }

        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        pivotIndex = partition(krishanu, left, right, pivotIndex);

        if (pivotIndex == target) {
            return krishanu[pivotIndex];
        } else if (pivotIndex < target) {
            return quickSelect(krishanu, pivotIndex + 1, right, target);
        } else {
            return quickSelect(krishanu, left, pivotIndex - 1, target);
        }
    }

    private int partition(int[] krishanu, int left, int right, int pivotIndex) {
        int pivotValue = krishanu[pivotIndex];
        // move pivot to the end
        swap(krishanu, pivotIndex, right);

        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (krishanu[i] < pivotValue) {
                swap(krishanu, storeIndex, i);
                storeIndex++;
            }
        }
        // move pivot to its final sorted position
        swap(krishanu, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] krishanu, int i, int j) {
        int temp = krishanu[i];
        krishanu[i] = krishanu[j];
        krishanu[j] = temp;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/)
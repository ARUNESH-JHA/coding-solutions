# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** JavaScript  
**Runtime:** 4 ms (beats 31.17%)  
**Memory:** 60.5 MB (beats 45.82%)  
**Submitted:** 2026-10-20T16:20:14.225Z  

```js
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(arr) {
    let i=0;
    let j=0;

    while(i<arr.length)
    {
        if(arr[i]!==0){
            [arr[i],arr[j]]=[arr[j],arr[i]]
            j++;


        }
        i++
    }

   
return arr;
    
};
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)
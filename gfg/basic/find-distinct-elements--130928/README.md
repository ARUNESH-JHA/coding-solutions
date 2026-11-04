# Count Distinct in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array **arr[]**  **,**  return the count of all the distinct elements in an array

 **Examples:** 

```
Input: arr[] = [2, 2, 3, 2]
Output: 2
Explanation: Distinct elements are {2, 3}
```

```
Input: arr[] = [12, 1, 14, 3, 16]
Output: 5
Explanation: Distinct elements are {12, 1, 14, 3, 16}

```

```
Input: arr[] = [1, 1, 1, 1]
Output: 1
Explanation: Only one distinct element {1}  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T15:05:29.914Z  

```java
class Solution {
    public int countDistinct(int arr[]) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        for(int ele:arr)set.add(ele);
        return set.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-distinct-elements--130928/1)
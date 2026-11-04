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
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                // you are in dec part of the array
                // this may be the ans, but look at left
                end = mid;
            } else {
                // arr[mid + 1] > arr[mid]
                // you are in inc part of the array
                start = mid + 1;
                   }
        } 
        
        // In the end, start == end and pointing to the largest number because of the 2 checks 
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max element
        // At every point of time of start and end, there may be a best possible ans at that particular time
        return end;
    }
}

class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i<n ; i++){
            currentSum += arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum <0){  // writing this condition at last because of the edge case
                currentSum = 0;
            }
        }
        return maxSum;
    }
}

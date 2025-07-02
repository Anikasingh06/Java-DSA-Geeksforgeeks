class Solution {
    int majorityElement(int arr[]) {
        int freq = 0;
        int ans = 0;

       
        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                ans = arr[i];
                freq = 1;
            } else if (arr[i] == ans) {
                freq++;
            } else {
                freq--;
            }
        }

      
        freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans) {
                freq++;
            }
        }

        if (freq > arr.length / 2) {
            return ans;
        } else {
            return -1; 
        }
    }
}
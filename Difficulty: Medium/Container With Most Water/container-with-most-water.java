class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int maximumWater = 0;
        int lp = 0;
        int rp = arr.length-1;
         
         while(lp<rp){
             int currHeight = Math.min(arr[lp], arr[rp]);
             int width = rp-lp;
             int area = currHeight * width;
             maximumWater = Math.max(area , maximumWater);
             
             if(arr[lp] < arr[rp]){
                 lp++;
             }else{
                 rp--;
             }
         }
         return maximumWater;
    }
}
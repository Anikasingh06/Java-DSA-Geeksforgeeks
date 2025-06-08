class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length <2){
            return -1;
        }
 
        int largest = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num > largest){
                seclar = largest;
                largest = num;
            } else if( num > seclar && num != largest) {
                seclar  =num;
            }
        }
        
        if(seclar == Integer.MIN_VALUE){
           return -1;
           
        }else{
             return seclar;
        }
    }
}

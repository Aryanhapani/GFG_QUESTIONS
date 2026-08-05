class Solution {
    public int getSecondLargest(int[] arr) {
       int max=Integer.MIN_VALUE;
       int sec=Integer.MIN_VALUE;
       
       for(int i=0;i<arr.length;i++){
           if(max < arr[i]){
               sec=max;
               max=arr[i];
           }else if(max != arr[i] && sec < arr[i]){
               sec=arr[i];
           }
           
          
       }
       
       if(sec==Integer.MIN_VALUE){
           return -1;
       }
       
       return sec;
        
    }
}
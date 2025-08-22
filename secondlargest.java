class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int larg=-1,sec=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>larg && arr[i]>sec){
                sec=larg;
                larg=arr[i];
                
            }
            else if(arr[i]<larg && arr[i]>sec){
                sec=arr[i];
            }
        }
        return sec;
    }
}
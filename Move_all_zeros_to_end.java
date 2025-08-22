class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int c=0,j=0;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
               temp[j]=arr[i];
               j++;
            }
            else{
                
                  c++;
            }
        }
        
        for(int i=0;i<c;i++){
            temp[n-c+i]=0;
        }
        
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
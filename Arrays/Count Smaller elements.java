class Solution {
    int[] constructLowerArray(int[] arr) {
        // code here
          int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int c=0;
            for(int j=i+1;j<arr.length;j++){
                if(a>arr[j]) c++;    
            }
            arr[i]=c;
        }
        return arr;

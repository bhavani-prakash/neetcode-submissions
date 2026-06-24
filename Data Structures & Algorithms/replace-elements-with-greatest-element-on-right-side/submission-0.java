class Solution {
    public int[] replaceElements(int[] arr) {

        // brute
        // for(int i=0;i<arr.length;i++){
        //     if(arr.length-1==i){
        //         arr[i]=-1;
        //         break;
        //     }
        //     int max=arr[i+1];
        //     for(int j=i+1;j<arr.length;j++){
        //        if(arr[j]>max)
        //          max=arr[j];
                
        //     }
        //     arr[i]=max;
        // }

        // return arr;


        // optimal 
        // itrating from the back 

        int s=arr.length;
        int max=arr[s-1];
        int pmax=0;
        for(int i=s-1;i>=0;i--){
            if(i==s-1){
                arr[i]=-1;
                continue;
            }
            if(arr[i]>max){
                pmax=arr[i];
                arr[i]=max;
                max=pmax;
            }
            else{
                arr[i]=max;
            }
              

        }

        return arr;
        
    }
}
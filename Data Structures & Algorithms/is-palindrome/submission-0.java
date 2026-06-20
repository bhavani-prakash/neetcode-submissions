class Solution {
    public boolean isPalindrome(String s) {

        String a=s.toLowerCase().replaceAll("[^a-z0-9\\s]","").replace(" ","");
        int start=0;
        int end=a.length()-1;
        boolean ispal=true;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(start)==a.charAt(end)){
                start++;
                end--;
            }
            else{
                ispal=false;
                break;
            }
        }
        return ispal;

        
    }
}

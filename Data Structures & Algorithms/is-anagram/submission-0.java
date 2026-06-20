class Solution {
    public boolean isAnagram(String s, String t) {
       // sort the 2 strings and copare the with value 

                  // or 

       // collections 

       
       char[] a=s.toCharArray();
       char[] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       
        return Arrays.equals(a, b);
      


    }
}

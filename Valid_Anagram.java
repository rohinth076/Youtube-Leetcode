1ST METHOD 

class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);
    }
}

2ND METHOD

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        
        for(char i:s.toCharArray())
            a[i-'a']++;
        
        for(char i:t.toCharArray())
            b[i-'a']++;
        
        return Arrays.equals(a,b);
    }
}

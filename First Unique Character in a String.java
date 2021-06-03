Method 1:

class Solution {
    public int firstUniqChar(String s) {
        
        int n = s.length();
        
        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=0;j<n;j++)
            if(s.charAt(i) == s.charAt(j) && i != j)
            {
                flag = false;
                break;
            }
            if(flag)
                return i;
        }
        
        return -1;
    }
}


Method 2:

class Solution {
    public int firstUniqChar(String s) {
        int[] a = new int[26];
        
        for(char i:s.toCharArray())
            a[i-'a']++;
        
        for(int i=0;i<s.length();i++)
            if(a[s.charAt(i)-'a'] == 1)
                return i;
        
        return -1;
    }
}

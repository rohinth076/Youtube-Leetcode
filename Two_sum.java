Method 1:


class Solution {
    public int[] twoSum(int[] a, int t) {
        int[] ans = new int[2];
        
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                if(a[i]+a[j] == t){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
        }
        
        return ans;
    }
}


Method 2:

class Solution {
    public int[] twoSum(int[] a, int t) {
        int[] ans = new int[2];
        int n = a.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(t-a[i])){
                ans[0] = m.get(t-a[i]);
                ans[1] = i;
                return ans;
            }
            m.put(a[i],i);
        }
        return ans;
    }
}

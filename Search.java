1. Linear Search

class Solution {
    public int search(int[] a, int t) {
        int n = a.length;
        
        for(int i=0;i<n;i++)
            if(a[i] == t)
                return i;
        
        return -1;
    }
}

2. Binary Search

class Solution {
    public int search(int[] a, int t) {
        
        int n = a.length;
        int l = 0,r = n-1;
        while(l<=r){
           int mid = l+(r-l)/2;
            if(a[mid] == t)
                return mid;
            else if(a[mid] < t)
                l = mid+1;
            else
                r = mid -1;
        }
        
        return -1;
    }
}

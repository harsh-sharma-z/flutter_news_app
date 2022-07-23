class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        
        for(int i=0,j=0;i<n;i++,j=j+2)
        {
            ans[j]=nums[i];
            ans[j+1]=nums[i+n];
        }
        
        return ans;
        
        
    }
}

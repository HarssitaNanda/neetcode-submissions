class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] res=new int[n+1];

        for(int i=1;i<=n;i++){
            res[nums[i-1]]++;
            if(res[nums[i-1]]>1) return nums[i-1];
        }
        return -1;
    }
}

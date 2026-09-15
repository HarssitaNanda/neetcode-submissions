class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0; int high=n-1; int mid=0;
        while(low<high){
            // mid=low+(high-low)/2;
            if(nums[low]>nums[low+1]) return nums[low+1];

            if(nums[low]<nums[low+1]) low+=1;
            
        }
        return nums[0];
    }
}

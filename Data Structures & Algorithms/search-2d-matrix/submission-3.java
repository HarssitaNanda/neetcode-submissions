class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row=nums.length;
        int col=nums[0].length;


int low=0; int high=col-1;
        int mid=0;

        for(int i=0;i<row;i++){
            low=0;high=col-1;
             while(low<=high){
            mid=low+(high-low)/2;

            if(nums[i][mid]==target) return true;
            if(nums[i][mid]<target) low=mid+1;
            else high=mid-1;
        }
        }
        
        return false;
    }
}

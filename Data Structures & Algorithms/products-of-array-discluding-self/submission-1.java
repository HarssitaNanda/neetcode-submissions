class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int prodNoZero=1; int prod=1;
        int countZeros=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
            prodNoZero*=nums[i];
            if(nums[i]==0) countZeros++;
            prod*=nums[i];

        }
        if(countZeros<=1){
        for(int i=0;i<n;i++){
            
            if(nums[i]==0) res[i]=prodNoZero;
            else
            res[i]=prod/nums[i];
            }

        }
         if(countZeros>1){
        for(int i=0;i<n;i++){
            res[i]=0;
            }

        }
        return res;
    }
}  

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int n=numbers.length;

        int low=0; int high=n-1;

        while(low<=high){
            if(numbers[low]+numbers[high]>target){
                high-=1;
            }
            if(numbers[low]+numbers[high]<target){
                low+=1;
            }
             if(numbers[low]+numbers[high]==target)
            return new int[]{low+1,high+1};
        }
        return new int[]{-1,-1};
    }
}

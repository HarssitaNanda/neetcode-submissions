class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0;int r=n-1;
        int maxArea=0; int area=0;
        while(l<=r){
            area=Math.min(heights[l],heights[r])*(r-l);
            maxArea=Math.max(area,maxArea);
            if(heights[l]>=heights[r]){
                r--;
            }
            // if(heights[l]<heights[r]){
            //     l++;
            // }
            else l++;
        }
        return maxArea;
    }
}

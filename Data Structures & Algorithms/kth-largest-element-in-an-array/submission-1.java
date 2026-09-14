class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());

        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     heap.offer(nums[i]);
        // }
        // while(k>1){
        //     heap.poll();
        //     k--;
        // }
        // return heap.poll();


         PriorityQueue<Integer> heap=new PriorityQueue<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            heap.offer(nums[i]);
        }
        while(heap.size()>k){
            heap.poll();
        }
        return heap.poll();
    }
}

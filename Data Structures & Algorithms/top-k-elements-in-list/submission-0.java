class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int key: map.keySet()){
            heap.offer(key);
        }

        while(heap.size()>k){
            heap.poll();
        }

        int[] res=new int[k]; int m=0;
        while(m<k){
            res[m]=heap.remove();
            m++;
        }
        return res;
    }
}

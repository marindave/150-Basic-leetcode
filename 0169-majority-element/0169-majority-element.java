class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>table=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(table.containsKey(nums[i])){
                table.put(nums[i],table.get(nums[i])+1);
            }else{
                table.put(nums[i],1);
            }
            if(table.get(nums[i])>n/2) return nums[i];
        }
        return 0;
    }
}
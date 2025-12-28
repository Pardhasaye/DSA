class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int streak=0;
        long cnt=0;
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(nums[i]==0){
                streak+=1;
                cnt+=streak;
            }
            else{
                streak=0;
            }
        }
        return cnt;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int []pro=new int[size];
        pro[0]=1;
        for(int i=1;i<size;i++){
            pro[i]=pro[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=size-2;i>=0;i--){
            suffix*=nums[i+1];
            pro[i]*=suffix;
        }   

      
        return pro;
        


        
    }
}
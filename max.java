class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0,max;
        int j=0;
        while(k>0){
        max = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]>max){
                max=nums[i];
                j=i;
            }
        }
        sum=sum+max;
        nums[j]=max+1;
        k--;
        }
     return sum;
}
}

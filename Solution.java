class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j;
        for( i=2,j=2;i<nums.length;i++){
            if(nums[i]>nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}

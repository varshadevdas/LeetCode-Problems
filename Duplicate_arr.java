class Duplicate_arr {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        //int n = nums.length;
        int counter = 0;
        for(int i = 1;i<nums.length;i++){
          if(nums[i-1]==nums[i]) {
            counter ++;
          }
        }
        if(counter>=1)
          return true;
        else
          return false;
    }
}
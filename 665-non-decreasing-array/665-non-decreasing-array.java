class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        boolean changed = false;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] <= nums[i]) continue;
            if (changed) return false;
            
            changed = true;
            if (i == 1 || nums[i-2] <= nums[i]) nums[i-1] = nums[i];
            else nums[i] = nums[i-1];
        }
        return true;
    }
}
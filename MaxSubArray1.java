class MaxSubArray1 {
  public int maxSubArray(int[] nums) {
      int len = nums.length;
      int maxSum = Integer.MIN_VALUE;
      int sum = 0;
      for (int i = 0; i < len; i++) {
        sum = 0;
        for (int j = i; j < len; j++) {
          sum += nums[j];
          maxSum = Math.max(maxSum, sum);
        }
      }
      return maxSum;
  }
}


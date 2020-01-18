class Rotate1 {
    public void rotate(int[] nums, int k) {
    	int len=nums.length;
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = a[i];
        }
    }
}
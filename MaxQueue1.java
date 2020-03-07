class MaxQueue1 {
    
    private int[] arr = new int[10000];

    private int start = 0, end = 0;

    public MaxQueue() {
    }

    public int max_value() {
        if (end - start == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public void push_back(int value) {
        arr[end++] = value;
    }

    public int pop_front() {
        if (end - start == 0) {
            return -1;
        }
        return arr[start++];
    }
    
}

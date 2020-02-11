class NumberOfSteps 1{
    public int numberOfSteps (int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = (num & 1) == 1 ? num & -2 : num >> 1;
        }
        return count;
    }
}
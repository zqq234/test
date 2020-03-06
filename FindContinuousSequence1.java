class FindContinuousSequence1 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();

        if(target <= 2){
            return null;
        }

        for(int i = 1;i < target/2 + 1;i ++){
            int temp = target;
            int count = i;
            while(temp > 0){
                temp = temp - count;
                count++;
            }
            if(temp == 0){
                int[] arr = new int[count - i];
                int a = i;
                for(int j = 0;j < arr.length;j++){
                    arr[j] = a;
                    a++;
                }
                res.add(arr);
            }
        }
    
        return res.toArray(new int[0][]);

    }
}

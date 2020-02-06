class MinTimeToVisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count=0;
        for(int i=0;i<points.length-1;i++){
            int sub1=Math.abs(points[i][0]-points[i+1][0]);
            int sub2=Math.abs(points[i][1]-points[i+1][1]);
            count+=sub1>sub2?sub1:sub2;
        }
        return count;
    }
}
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrowCnt = 1;
        int arrowPos = points[0][1];
        for(int[] point : points){
            if(arrowPos<point[0]){
                arrowPos = point[1];
                arrowCnt++;
            }
        } 
        return arrowCnt;


    }
}
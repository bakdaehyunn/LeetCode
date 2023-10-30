class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result =new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] current=  intervals[0];
        result.add(current);
        for(int[] interval:intervals){
            if(current[1]>=interval[0]){
                current[1]=Math.max(interval[1],current[1]);
            }else{
                current = interval;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
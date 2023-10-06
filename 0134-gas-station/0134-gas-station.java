class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int total =0;
        int sum =0 ; 
        int start=0;
        for(int i=0;i<gas.length;i++){
          sum +=gas[i]-cost[i];
          if(sum<0){
            total += sum;
            start = i+1;
            sum=0;
          }
        }
        total+=sum;
        return total>=0?start:-1;
    }
}
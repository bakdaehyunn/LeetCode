class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n+1];
        for(int c:citations){
          if(c>=n){
            buckets[n]+=1;
          }else{
            buckets[c]+=1;
          }
        }
        int count=0;
        for(int i=n;i>=0;i--){
          count+=buckets[i];
          if(count>=i){
            return i;
          }
        }
        return 0;
    }
}
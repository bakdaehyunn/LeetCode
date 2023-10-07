class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        int index=0;
        while(index<s.length()){
            for(int i=0;i<numRows&&index<s.length();i++){
                sb[i].append(s.charAt(index));
                index++;
            }
            for(int i=numRows-2;i>0&&index<s.length();i--){
                sb[i].append(s.charAt(index));
                index++;
            }

        }
        StringBuilder result =new StringBuilder();
        for(int i=0;i<numRows;i++){
            result.append(sb[i]);
        }
        return result.toString();
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<>();
        int rowBegin=0;
        int rowEnd = matrix.length-1;
        int colBegin =0;
        int colEnd=matrix[0].length-1;
        while(rowBegin<=rowEnd&&colBegin<=colEnd){
            for(int j=colBegin;j<=colEnd;j++){
                list.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for(int j=colEnd;j>=colBegin;j--){
                    list.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    list.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }
        return list;
    }
}
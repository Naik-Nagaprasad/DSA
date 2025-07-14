class Solution {
    // public static void setZeroRow(int[][] matrix, int row){
    //     for(int i=0; i<matrix[row].length; i++){
    //         if(matrix[row][i] != 0)
    //             matrix[row][i] = -1;
    //     }
    // }
    // public static void setZeroCol(int[][] matrix, int col){
    //     for(int i=0; i<matrix.length; i++){
    //         if(matrix[i][col] != 0)
    //             matrix[i][col] = -1;
    //     }
    // }
    // public void setZeroes(int[][] matrix) {
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[i].length; j++){
    //             if(matrix[i][j] == 0){
    //                 setZeroRow(matrix, i);
    //                 setZeroCol(matrix, j);
    //             }
    //         }
    //     }
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[i].length; j++){
    //             if(matrix[i][j] == -1){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }
    
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(zeroRow[i] || zeroCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
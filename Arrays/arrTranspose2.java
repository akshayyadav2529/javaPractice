public class arrTranspose2 {
    public static void main(String[] args){
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<matrix.length-1; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                swap(matrix[i][j],matrix[j][i]);
            }
            System.out.println();
        }
       
    }

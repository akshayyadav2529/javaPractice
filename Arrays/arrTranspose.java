import java.util.Arrays;

public class arrTranspose {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Array:");
        for(int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
        int[][] transposedArr = new int [arr[0].length][arr.length];
        System.out.println("Transposed Array:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                transposedArr[j][i]=arr[i][j];
                }
                }for(int[] row: transposedArr){
                    System.out.println(Arrays.toString(row));
        } 
    }
}
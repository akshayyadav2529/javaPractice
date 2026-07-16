public class arrSubtraction {
    public static void main(String[] args){
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] C = new int[3][3];

        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                C[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        for(int[] row: C){
            for(int col: row){
                System.out.print(col+" ");
            }            System.out.println();
        }
    }
}

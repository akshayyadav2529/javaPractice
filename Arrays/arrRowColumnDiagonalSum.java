//Create a program of matrix where the last row, column, diagonal contain the sum of the respective row, column and diagonal.
import java.util.Scanner;
public class arrRowColumnDiagonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c= sc.nextInt();
        int arr[][] = new int[r+1][c+1];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix element are:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
           
    }
 
 }

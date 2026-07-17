import java.util.Scanner;
public class arrDiagonalSum {
    public static void main(String[] args){
        //step 1:Create a square matrix of the size you desire
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the square matrix");
        int n= sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the matrix elements:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j]= sc.nextInt();
            }
        }
        //Step 2; Print the matrix elements:
        System.out.println("Matrix elements are as follows");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        //Step 3: Sum the diagonal elements 
        int sum1= 0,sum2=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sum1 = sum1 + a[i][j];
                    //can also be written as sum1 += a[i][j];                   
                }
                if((i+j)==(n-1)){
                    sum2 = sum2 + a[i][j];
                }
            }
        }
        System.out.println("Sum of the diagonal elements are as follows:");
        System.out.println("Sum of the primary diagonal elements: "+sum1);
        System.out.println("Sum of the secodary diagonal elements:"+sum2);
    }
}

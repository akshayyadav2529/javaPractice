import java.util.Scanner;
public class arrDiagonalPrint {
    public static void main (String[] args){
        int a[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for(int i = 0; i<4; i++){
            for(int j=0; j<4 ; j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix elements are as follows:");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i =0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i==j || (i+j)==3){
                    System.out.print(a[i][j]+"\t");
                }
                else{
                    System.out.println();
                }

            }
        }
    }
}

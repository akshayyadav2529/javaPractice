import java.util.Scanner;
public class arrRowSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the array:");
        for(int i= 0; i<r; i++){
            for(int j= 0; j<c ; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //Sum of each row
        int sumr = 0;
        for (int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                sumr += arr[i][j];
            }System.out.println("Sum of Row "+(i+1)+" is :"+sumr);
            sumr=0;
        }
        //sum of each column:
        int sumc=0;
        for(int j= 0; j<c; j++){
            for(int i=0; i<r; i++){
                sumc += arr[i][j];
            }System.out.println("Sum of Column "+(j+1)+" is :"+ sumc);
            sumc=0;
        }
    }
}
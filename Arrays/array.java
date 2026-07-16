public class array{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        // using for loop
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // using for-each loop
        for ( int no: arr) {
            System.out.print( no+ " " );
        }


    }



}
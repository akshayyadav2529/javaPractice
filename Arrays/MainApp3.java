public class MainApp3 {
    public static void main(String[] args) {
        int[] arr = {10, 20,30,40,50};
        int indexpos = 3;
        int[] newArry = new int[arr.length-1];

        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(i==indexpos){
                continue;
            }
            newArry[j]= arr[i];
            j++;
        }
        for(int no: newArry){
            System.out.print(no + " ");
        }
    }
}

public class Min {
    public static void main(String[] args){
        int arr[] = {-20, 12, 23, 6, 76};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

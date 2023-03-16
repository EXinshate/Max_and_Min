public class Max {
    public static void main(String[] args){
        /* 数组为举例 */
        int arr[] = {20, 12, 23, 6, 76};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

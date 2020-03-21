package KompjuterIya.HW190320;

public class Odd {
    public static void main(String[] args) {
        int [] arr = {1,2,8,7,5,9,42,58,11,32,-4,8,17,-9,22};
        int result =1;
        for (int i=1; i<arr.length;i+=2){
            result*=arr[i];
        }
        System.out.println(result);
    }

}

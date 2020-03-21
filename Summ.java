package KompjuterIya.HW190320;

public class Summ {
    public static void main(String[] args) {
        int[] arr={1,-5,7,-9,-4,2,-3,3};
        int summ=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                summ+=arr[i];
            }
        }
        System.out.println(summ);
    }
}

package Calismalarim.ReplitGithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG33 {

    public static void main(String[] args) {

    /*33-----
    Bir arrayi tersine çeviren  method yazınız.
    Test Data:

    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    */
int arr[]={1, 2, 3, 4};
int tersarr[]=new int[arr.length];


        reverse(arr,tersarr);
    }

    private static void reverse(int[] arr, int[] tersarr) {

        for (int i = 0; i < arr.length ; i++) {
            tersarr[i]=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(tersarr));
    }
}

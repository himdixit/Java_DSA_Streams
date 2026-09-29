package DSA.TwoPointers;

import java.util.Arrays;

public class PushZero {
    public static void main(String[] args) {
        int[] arr=new int[]{4,6,0,7,8,0,0,0,9};
        int i=0;
        int j=0;
        while (i < arr.length) {
            if(arr[i]!=0)
            {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        while(j < arr.length)
            arr[j++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}

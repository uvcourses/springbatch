package arrays;

import java.util.Arrays;

public class ArrayPosition {
    public static void main(String arg) {
        int input[]={1,2,3,4,5,6,7,8,9};
        ArrayPosition obj=new ArrayPosition();
        System.out.println("Before ");
        Arrays.stream(input).forEach( (s)-> System.out.print(s));
        obj.rearrange(input);
        System.out.println("After ");
        Arrays.stream(input).forEach( (s)-> System.out.print(s));

    }

    private void rearrange(int[] input) {
        int even=0,odd=input.length-1;

        while(even < odd) {
            if(input[even] %2 ==0 ) {
                even++;
            }else {
                int temp=input[even];
                input[even]=input[odd];
                input[odd--]=temp;
            }
        }
    }
}

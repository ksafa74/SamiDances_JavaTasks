package javaTasks;

public class SecondMaxNumber {

    // Given an array of integers return second max number

    public static int secondMax(int[] arr){ // 6,2,3,4,5,1

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num: arr){

            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax){
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr ={-6,-5,3,-4,2,1};
        System.out.println(secondMax(arr));

    }
}

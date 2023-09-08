public class RearrangeElements {
    public static int[] rearrange(int[] numbers){
        int[] neg = new int[numbers.length];
        int[] pos = new int[numbers.length];
        int j = 0, k = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                neg[j] = numbers[i];
                j++;
            }
            else {
                pos[k] = numbers[i];
                k++;
            }
        }
        j=0;
        for(int i = 0; i < neg.length; i++){
            if(neg[i] < 0) {
                numbers[j] = neg[i];
                j++;
            }

        }

        for (int i = 0; i < pos.length; i++){
            if(pos[i] > 0) {
                numbers[j] = pos[i]; // i er value amra zero chai jeno pos array access korte pari and J is just maintaining
                //serial of the res array
                j++;
            }
        }
        return numbers;

    }

    public static void printArray(int[] arr){
        for (int i: arr){
            System.out.println(i + " ");
        }
    }


    public static void main(String[] args){
        int[] nums = {1, 3, -4, 6, -5, -2, 4};
        //since rearrange is not a static method we cannot call it in main, so now we are gonna make it static
        System.out.println("Before rearrangement: ");
        printArray(nums);

        int[] res = rearrange(nums);

    }

}

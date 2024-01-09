public class SortingPractice {
    public  static int[] fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }
    public static  void printArray(int[] arr){
        for(int i :arr){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void main(String[]args){
        Sorting sorting = new Sorting();
        int nums[] = new int[20];
        fillArray(nums);

        System.out.println("Before sorting:");
        printArray(nums);

        System.out.println("After selection sort lower to bigger ");
        printArray(selectionSortNegativeToPositive(nums));

        System.out.println("After selection sort greater to lower");
        printArray(selectionSortPositiveToNegative(nums));

        System.out.println("*** Time for bubble sort***");
        printArray(bubbleSort(nums));

        System.out.println("Reverse Bubble sort");
        printArray(reverseBubbleSort(nums));


    }


    public static int[] selectionSortNegativeToPositive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
//    public static int[] selectionSortPositiveToNegative(int[] arr){
//        for(int i  = 0; i < arr.length; i++){
//            int max = i;
//            for(int j = i + 1; j< arr.length; j++){
//                if (arr[j] > max){
//                    max = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[max];
//            arr[max] = temp;
//        }
//        return arr;
//    }
    public static int[] selectionSortPositiveToNegative(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int max = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }


    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] reverseBubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -i -1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = arr[j];
                }
            }
        }
        return arr;
    }


}

public class FinalsPractice {
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


    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        System.out.println("Before sorting: ");
        printArray(arr);
        System.out.println("Sorting from highest to lowest");
        printArray(selectionSort(arr));
        System.out.println("Sorting from lowest to highest ");
        printArray(selectionSortLowestToHighest(arr));
        System.out.println("Bubble sort");
        printArray(bubbleSort(arr));
        System.out.println("Reverse bubble sort");
        printArray(reverseBubbleSort(arr));

    }
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int max = i;
            for(int j = i+ 1; j < arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            //exchange value between arr[i] and arr[max]
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

        }
        return arr;
    }
    public static int[] selectionSortLowestToHighest(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
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
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] reverseBubbleSort(int[]arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length -i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j +  1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;
    }
}

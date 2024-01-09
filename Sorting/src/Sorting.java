public class Sorting {
    public int[] fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }
    public void printArray(int[] arr){
        for(int i :arr){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Sorting sorting = new Sorting();
        int[] nums = new int[20];
        nums = sorting.fillArray(nums);
        System.out.println("Before sorting");
        sorting.printArray(nums);
        System.out.println("After sorting");
        System.out.println("Selection sort");
        nums = sorting.selectionSort(nums);
        sorting.printArray(nums);
        System.out.println("Selection Sort with positive");
        nums = sorting.selectionSortWithPositive(nums);
        sorting.printArray(nums);
        System.out.println("bubble sort");
        nums = sorting.bubbleSort(nums);
        sorting.printArray(nums);
        System.out.println("Reverse Bubble sort");
        nums = sorting.reverseBubbleSort(nums);
        sorting.printArray(nums);
    }
    public int[] selectionSort(int[] arr){
        for(int i = arr.length -1; i >= 0; i--){
            int max = i;
            for(int j = i - 1; j > 0; j--){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            //exhcnage values between arr[i] and arr[min]
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
    public int[] selectionSortWithPositive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //exhcnage values between arr[i] and arr[min]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //for one pass
            for(int j = 0; j < arr.length -i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public int[] reverseBubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //for one pass
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
}

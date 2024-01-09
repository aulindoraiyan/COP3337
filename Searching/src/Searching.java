public class Searching {
    public static int ItterativeLinearSearch(int[] arr, int target){
        if(arr.length <= 0){
            return -1;
        }
        else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                    return i;
                }

            }
            return -1;
        }
    }
    public static void main(String[] args){
        int[] numbers = {5, 15, 3, 11, 2, 8, 9, 4,324 };
        int[] sortedArray = {3, 5, 7, 9, 13, 15, 17};
        int res = RecursiveBinarySearch(sortedArray, 15, 0, sortedArray.length);
//        int res = ItterativeLinearSearch(numbers, 324);
//        int res = RecursiveLinearSearch(numbers, 324, numbers.length);
        if(res == -1){
            System.out.println("Unable to find");
        }
        else
            System.out.println("Value found at index: " + res);
    }
    public static int RecursiveLinearSearch(int[] arr, int value, int size){
        if(size < 0)
            return -1;
        else if(arr[size -1]  == value)
            return size - 1;
        else return RecursiveLinearSearch(arr, value, size -1);

    }
    public static int RecursiveBinarySearch(int[] arr, int value, int start, int end){
        if(start > end){
            return -1;
        }
        else{
            int mid = (start + end) / 2;
            if(value == arr[mid]){
                return mid;
            }
            else if(value < arr[mid]){
                return RecursiveBinarySearch(arr, value, start, mid - 1);
            }
            else {
                return RecursiveBinarySearch(arr, value, start + 1, end);
            }
        }
    }
}

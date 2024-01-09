public class FinalPracticeSearching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7 };
        System.out.println(iterativeLinearSearch(arr, 10));
        System.out.println(binarySearch(arr, 5));
        System.out.println(recursiveBinarySearch(arr, 5, 0, arr.length -1));
        System.out.println(recursiveLinearSearch(arr, 8, 0));
    }
    public static int iterativeLinearSearch(int[] arr, int target){


        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }
    public static int recursiveLinearSearch(int[] arr, int target, int index){
        if(index > arr.length -1 ){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return recursiveLinearSearch(arr, target, index + 1);
        }
    }

    //the basis of bninary search is that first e it divides the array into two and then searches either left or right.
    //Binary search can only be applied to sorted array.

    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length -1;

        while (l <= r){
            int mid = (l + r)/ 2;
            if (target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }

        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] arr, int target, int start, int end){
        int mid = (start + end) / 2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target > arr[mid]){
            return recursiveBinarySearch(arr, target, mid + 1, end);
        }
        else{
            return recursiveBinarySearch(arr, target, start, mid - 1);
        }

    }
}

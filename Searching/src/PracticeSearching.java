public class PracticeSearching {
    public static void main(String[] args){
        int[] sortedArray = {3, 5, 7, 9, 13, 15, 17};
//        System.out.println(recursiveBinarySearch(sortedArray, 17, 0, sortedArray.length -1));
//        System.out.println(linearSearch(sortedArray, 17, 0));
        System.out.println(IterativeLinearSearch(sortedArray, 9));
        System.out.println(recurssiveLinearSearch(sortedArray, 13, 0));
        System.out.println(binarySearch(sortedArray, 15, 0, sortedArray.length));
        System.out.println(Problem14(3));
    }
//    public static int recursiveBinarySearch(int[] arr, int target,  int start, int end){
//        if(start > end){
//            return -1 ;
//        }
//        else {
//            int mid = (start + end) / 2;
//            if (target == arr[mid]) {
//                return mid;
//            } else if (target < arr[mid]) {
//                return recursiveBinarySearch(arr, target, start, mid - 1);
//            } else {
//                return recursiveBinarySearch(arr, target, mid + 1, end);
//
//            }
//        }
//
//    }
//    public static int linearSearch(int[] arr, int target, int index){
//        if(index > arr.length -1 ){
//            return -1;
//        }
//        else{
//            if(arr[index] == target){
//                return index;
//            }
//            else{
//                return linearSearch(arr, target, index + 1);
//            }
//        }
//    }
    public static int IterativeLinearSearch(int[] arr, int target){
        int foundValue = -1;
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                foundValue = i;
            }
        }
        return foundValue;

    }

    public static int recurssiveLinearSearch(int[] arr, int target, int index){
        if(index > arr.length ){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return recurssiveLinearSearch(arr, target, index + 1);
        }
    }
    public static int binarySearch(int arr[], int target, int start, int end){
        int mid = (start + end) / 2;
        if(target == arr[mid])
            return mid;
        if(target > arr[mid]){
            return binarySearch(arr, target, mid + 1, end);
        }
        if(target < arr[mid]){
            return binarySearch(arr, target, start, end -1);
        }
        else{
            return -1;
        }
    }

    public static int Problem14(int n){
        if(n < 1){
            return 0;
        }
        return Problem14(n - 1) + (int)Math.pow(n, 2);
    }




}

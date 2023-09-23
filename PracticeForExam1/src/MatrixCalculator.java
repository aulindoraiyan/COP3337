public class MatrixCalculator {
    public static void main (String[]args){
        MatrixCalculator mc = new MatrixCalculator();
//        int [][] A = new int[4][4];
//        int [][] B = new int [4][4];
//
//        System.out.println("Matrix A:");
//        mc.fillArray(A);
//        mc.printArray(A);
//
//        System.out.println("Matrix B: ");
//        mc.fillArray(B);
//        mc.printArray(B);
//
//        int[][] C = subtractMatrix(A, B);
//        System.out.println("Matrix C");
//        printArray(C);

        int[][] items = {
                {0, 1, 3, 4},
                {4, 5, 99, 0, 7},
                {3, 2}
        };
        int[] temp = {8, 12, 6};
        items[0] = temp;

        mc.printArray(items);



    }
    public static void printArray(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.printf("%4d", arr[row][col]);
            }
            System.out.println();
        }
    }
    public static int[] [] fillArray(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){

                arr [row][col] = (int)(Math.random()* 100);
            }
        }
        return arr;
    }
    public static int[][] subtractMatrix(int [][ ]A, int[][]B){
        if(A.length != B.length){
            System.out.println("Invalid row number between the matrices");
            System.exit(0);
        }
        if(A[0].length != B[0].length){
            System.out.println("Invalid row number between the matrices");
            System.exit(0);

        }
        int[][] C = new int[A.length][A[0].length];
        for(int row = 0; row < A.length; row++){
            for(int col = 0; col < A[0].length; col++){
                C[row][col] = A[row][col] - B[row][col];
            }
        }
        return C;
    }
}

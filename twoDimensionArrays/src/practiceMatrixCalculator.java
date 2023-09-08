public class practiceMatrixCalculator {
    public static void main (String[] args){
        practiceMatrixCalculator mc = new practiceMatrixCalculator();
        System.out.println("Matrix A= ");
        int [][] A = new int[3][3];
        mc.fillArray(A);
        mc.printArray(A);

        System.out.println("Matrix B= ");
        int[][] B = new int[3] [3];

        mc.fillArray(B);
        mc.printArray(B);

        int [][ ] C = mc.addArray(A, B);
        System.out.println("Matrix C= ");
        mc.printArray(C);



    }
    public  int[][] fillArray(int[][] arr){
        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                arr [row][col] = (int)(Math.random()* 100);
            }
        }
        return arr;
    }
    public  void printArray(int[][] arr){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++ ){
                System.out.printf("%4d", arr[row][col]);

            }
            System.out.println();

        }




        }

    public int[][] addArray(int[][] arrA, int[][] arrB ){
        int[][] C = new int[arrA.length][arrA[0].length];

        if (arrA.length != arrB.length){
            System.out.println("No. of rows and columns must be equal");
            System.exit(0);
        }
        if(arrA[0].length != arrB[0].length){

            System.out.println("No. of rows and columns must be equal");
            System.exit(0);

        }
        else{
            for(int row = 0; row < arrA.length; row++){
                for (int col = 0; col < arrA[0].length; col++){
                    C[row] [col] = arrA[row][col] + arrB[row][col];
                }
            }
        }
        return C;
    }

    }


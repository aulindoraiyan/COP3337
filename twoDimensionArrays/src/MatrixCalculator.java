import java.util.Scanner;

public class MatrixCalculator {

    public int[][] fillArray(int [] [] arr){

        //arr.length has only the informqation
        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row] [col] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows and columns for matrix A:");
        int [] [] A = new int[scan.nextInt()][scan.nextInt()];

        System.out.println("Enter the rows and columns for matrix A:");
        int [] [] B = new int [scan.nextInt()][scan.nextInt()];

        System.out.println("Matrix A");
        MatrixCalculator mc = new MatrixCalculator();
        A = mc.fillArray(A);
        mc.printArray(A);

        System.out.println("Matrix B");
        B = mc.fillArray(B);
        mc.printArray(B);

        int[][]  C = mc.matrixAddition(A, B);
        System.out.println("A + B =");
        mc.printArray(C);

        int[][] D = mc.matrixSubtraction(A, B);
        System.out.println("A - B =");
        mc.printArray(D);
    }

    public void printArray(int [] [] arr){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col <arr[row].length; col++){
                System.out.printf("%4d", arr[row][col] );
            }
            System.out.println();
        }
    }

    public int[] [] matrixAddition(int[][]m1, int[] [] m2){
        if(m1.length != m2.length){
            System.out.println("Matrices do not have equal rows");
            System.exit(0);

        }
        if(m1[0].length != m2[0].length){
            System.out.println("Matrices do not have equal columns");
            System.exit(0);
        }

        int[] [] result = new int[m1.length][m1[0].length];

        for(int row = 0; row < m1.length; row++){
            for(int col = 0; col < m1[row].length; col++){
                result[row][col] = m1[row][col] + m2[row][col];
            }
        }
        return result;
    }

    public int[] [] matrixSubtraction(int[][]m1, int[] [] m2){
        if(m1.length != m2.length){
            System.out.println("Matrices do not have equal rows");
            System.exit(0);

        }
        if(m1[0].length != m2[0].length){
            System.out.println("Matrices do not have equal columns");
            System.exit(0);
        }

        int[] [] result = new int[m1.length][m1[0].length];

        for(int row = 0; row < m1.length; row++){
            for(int col = 0; col < m1[row].length; col++){
                result[row][col] = m1[row][col] - m2[row][col];
            }
        }
        return result;
    }
}
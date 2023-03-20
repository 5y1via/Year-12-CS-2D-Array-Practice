public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            for (int l = 0; l < array[i].length; l++){
                sum = sum + array[i][l];
            }
        }
        return sum;
    }

    // 2. sumRowN
    public static int sumRowN(int[][] array, int n){
        int count = 0;
        for (int i = 0; i < array[n].length; i++){
            count = count + array[n][i];
        }
        return count;
    }

    // 3. sumColN
    public static int sumColN(int[][] array, int n){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum + array[i][n];
        }
        return sum;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] array, int r1, int c1, int r2, int c2){
        int sum = 0;
        while (r1<=r2){
            sum += array[r1][c1++];
            if (r1==r2 && c1==c2+1){
                break;
            }
            if (c1 == array[r1].length){
                c1 = 0;
                r1++;
            }
        }
        return sum;

    }
}

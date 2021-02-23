package com.company.ExercitiiJavaFundamentals;

public class Ex17MatrixExample {

    public static void matrixExample(){

        int[][] m = new int[5][5];
        int x=0;
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m.length;j++){
                if(i==j) {
                    m[i][j] = x;
                    x++;
                }else m[i][j] = 0;
        }
        for(int i=0;i<m.length;i++) {
            for (int j = 0; j < m.length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}

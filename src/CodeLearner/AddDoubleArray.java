package CodeLearner;

import java.util.Scanner;

public class AddDoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the column of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the row of the array: ");
        int m = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}

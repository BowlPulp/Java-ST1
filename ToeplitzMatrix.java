import java.util.*;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int [][] matrix = new int[r1][c1];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();

        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    System.out.println("false");
                }
            }
        }
        System.out.println("true");
    }
}


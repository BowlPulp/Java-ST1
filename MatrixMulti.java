import java.util.*;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int [][]one = new int[r1][c1];

        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j] = scan.nextInt();
            }
        }

        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int [][]two = new int[r2][c2];

        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j] = scan.nextInt();
            }
        }

        // Logic
        if(c1!=r2){
            System.out.println("Not Valid");
            return;
        }

        int [][]prd = new int[r1][c2];
        for(int i=0;i<prd.length;i++){
            for(int j =0;j<prd[0].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j] += one[i][k] + two[k][j];
                }
            }
        }

        for(int i=0;i<prd.length;i++){
            for(int j =0;j<prd[0].length;j++){
                System.err.println(prd[i][j]);
            }
        }
    }
}

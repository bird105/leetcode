import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        char[][] arr1 = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j=0;j<m;j++){
                arr[i][j] = sc.next().charAt(0);
                if(arr[i][j] == 'G'){
                    arr1[i][j] = 'B';
                }else {
                    arr1[i][j] = arr[i][j];
                }
            }
        }
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j=0;j < m;j++){
                if(i==0 && j==0) continue;
                if(i == 0 && j != 0){ // 第一行
                    if(arr[i][j] != arr[i][j-1]){
                        count++;
                    }
                }
                if(i != 0 && j != 0){
                    if(arr[i][j] != arr[i][j-1] && arr[i][j] != arr[i-1][j]) {
                            count++;
                    }
                }
                if(i != 0 && j == 0){
                    if(arr[i][j] != arr[i-1][j]){
                        count++;
                    }
                }
            }
        }
        int less = 1;
        for (int i = 0; i < n; i++) {
            for (int j=0;j < m;j++){
                if(i==0 && j==0) continue;
                if(i == 0 && j != 0){ // 第一行
                    if(arr1[i][j] != arr1[i][j-1] ){
                        less++;
                    }
                }
                if(i != 0 && j != 0){
                    if(j != m-1){
                        if(arr1[i][j] != arr1[i][j-1] && arr1[i][j] != arr1[i-1][j] && arr1[i][j] != arr1[i-1][j+1]) {
                            less++;
                        }
                    }else{
                        if(arr1[i][j] != arr1[i][j-1] && arr1[i][j] != arr1[i-1][j]) {
                            less++;
                        }
                    }
                }
                if(i != 0 && j == 0){
                    if(arr1[i][j] != arr1[i-1][j]){
                        less++;
                    }
                }
            }
        }
        System.out.println(count - less);
    }
}

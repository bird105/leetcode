import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] op = new int[m];
        int[] x = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            op[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            x[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            y[i] = in.nextInt();
        }
        //前面都是输入
        for (int i = 0; i < op.length; i++) {
            if(op[i] == 1){
                result.add(getValue(a,x[i]-1,y[i]-1));
            }else{ // op[i] = 0 更新收藏夹
                updateValue(a,x[i]-1,y[i]);
            }
        }
        for(int i:result){
            System.out.println(i);
        }
    }
    public static int getValue(int[] a,int xi,int yi){
        int value = 0;
        for (int i = xi; i <= yi; i++) {
            value += a[i];
        }
        return value;
    }
    public static void updateValue(int[] a,int xi,int yi){
        a[xi] = yi;
    }
}

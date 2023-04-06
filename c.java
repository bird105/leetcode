import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        List<Double> result = new ArrayList<>();
        // 输入
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
        }
        int m = in.nextInt();
        int[] pos = new int[m];
        String[] op = new String[m];
        for (int i = 0; i < m; i++) {
            pos[i] = in.nextInt();
            op[i] = in.next();
        }
        // 处理
        for (int i = 0; i < m; i++) {
            result.add(cal(a,pos[i],op[i]));
        }
        System.out.println('a');
    }
    public static double cal(double[] a,int pos,String op){
        double sum = 0;
        double tmp = 0;
        if(op.equals("*")){
            tmp = a[pos-1] * a[pos];
        } else if (op.equals("/")) {
            tmp = a[pos-1] / a[pos];
        } else if (op.equals("-")) {
            tmp = a[pos-1] - a[pos];
        }else {
            tmp = 0;
        }
        for (int i = 0; i < a.length; i++) {
            if(i+1 == pos || i==pos){
                continue;
            }
            sum += a[i];
        }
        return sum+tmp;
    }
}

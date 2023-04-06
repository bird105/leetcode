import java.util.Arrays;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = Integer.parseInt(sc.next());
            nums[i][1] = Integer.parseInt(sc.next());
        }
        Arrays.sort(nums, (c, d) -> {
            if (c[0] == d[0]) return c[1] - d[1];
            return c[0] - d[0];
        });
        int max_x = nums[0][0];
//        int max_y = nums[0][1];
        int max_res = 0;
        for (int i = 0; i < nums.length;i++) {
            if (Math.abs(nums[i][0] - max_x)<=a) {
                int flag = 1;
                for(int j=i-1;j>0;j--){
                    if(Math.abs(nums[i][1] - nums[i][j])>b){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1){
                    result += 1;
                    if(result > max_res) max_res = result;
                    if (nums[i][0] < max_x) {
                        max_x = nums[i][0];
                    }
                } else{
                    if(result > max_res) max_res = result;
                    result = 0;
                }
            }
        }
        System.out.println(max_res);
    }
}

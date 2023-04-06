import java.util.*;

public class d {
    public static void main(String[] args) {
        // 输入
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        int[] result = new int[n];
        Map<Integer,int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            num[i] = tmp;
            int[] temp = new int[tmp];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = in.nextInt();
            }
            map.put(i,temp);
        }
        // 处理
        int count = 0;
        List<Integer> remain = contain0(result);
        while (remain.size() > 0){
            List<Integer> maxIndexList = getMaxIndex(num);
            if (maxIndexList.size() == 1){
                int maxIndex = maxIndexList.get(0);
                result[maxIndex] = 1;
                for (int i = 0; i < num[maxIndex]; i++) {
                    result[map.get(maxIndex)[i]-1] = 1;
                }
            }else {

            }

            remain = contain0(result);
            count += 1;
        }
        System.out.println(count);
    }
    public static List<Integer> getMaxIndex(int[] arr){
        int max = arr[0];
        List<Integer> maxIndexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxIndexList.clear();
                maxIndexList.add(i);
            } else if (arr[i] == max) {
                maxIndexList.add(i);
            }else{
                continue;
            }
        }
        return maxIndexList;
    }
    public static List<Integer> contain0(int[] arr){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
}

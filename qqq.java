import java.util.*;

public class qqq {
    static List<List<Integer>> result = new ArrayList<>();
    static Deque<Integer> path = new LinkedList<>();
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        backTracking(n);
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            List<Integer> temp = result.get(i);
            sum += getWeight(temp);
        }
        System.out.println(sum);
    }
    public static void backTracking(int n){
        if(path.size() == n){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i=1;i<=n;i++){
            if (path.contains(i)){
                continue;
            }
            if((path.getLast() * i) % MOD % 2 == 0){
                continue;
            }
            path.add(i);
            backTracking(n);
            path.removeLast();
        }
    }
    public static int getWeight(List<Integer> arr){
        int count = 0;
        for(int i=1;i<arr.size();i++){
            long resTemp = (arr.get(i) * arr.get(i-1))%MOD;
            if(resTemp % 2 == 1) count++;
        }
        return count;
    }
}


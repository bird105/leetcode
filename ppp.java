import java.util.*;

public class ppp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            solution(arr,set);
            System.out.println(set.size());
        }
    }
    public static void setArray(int[] arr, HashSet<Integer> set){
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                arr[i] = 0;
            }
        }
    }
    public static boolean isValid(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) return false;
        }
        return true;
    }
    public static void solution(int[] arr, HashSet<Integer> set){
        for (int i = arr.length-2; i>= 0; i--) {
            if(arr[i] > arr[i+1]){
                set.add(arr[i]);
                arr[i] = 0;
            }
        }
        setArray(arr,set);
        if(isValid(arr)){
            return;
        }else {
            solution(arr,set);
        }
    }
}


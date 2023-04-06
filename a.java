import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class a {
    static int max = 0;
    static Deque<Integer> finalPath = new LinkedList<>();
    static Deque<Integer> path = new LinkedList<>();
    static int pathIndex = 0;
    static int finalIndex = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        backTracking(arr,0,1);
        System.out.println(max);
    }
    public static void backTracking(int[] arr,int startIndex,int sum){
        if(startIndex >= arr.length){
            return;
        }
        for (int i = startIndex; i < arr.length; i++) {
            sum *= arr[i];
            if(sum > max){
                max = sum;
            }
            backTracking(arr,i+1,sum);
            sum /= arr[i];
        }
    }
}

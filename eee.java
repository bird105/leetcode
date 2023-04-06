import java.util.Scanner;

public class eee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int a = 0;
        int bc = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){
                a++;
            }else {
                bc++;
            }
        }
        int count = 0;
        while (a != bc){
            if(a > bc){
                a--;
                count++;
            }else {
                bc--;
                a++;
            }
        }
        System.out.println(count);
    }
}

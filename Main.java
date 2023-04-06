import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int x = in.nextInt();
            String s = in.next();
            System.out.println(s);
            int count = 1;
            int prediff = 0;
            int curdiff = 0;
            for (int i = 0; i < s.length()-1; i++) {
                curdiff = (int) s.charAt(i + 1) - (int) s.charAt(i);
                if((prediff >= 0 && curdiff < 0) ||(prediff <= 0 && curdiff > 0)){
                    count++;
                    prediff = curdiff;
                }
            }
            System.out.println(count);
        }
    }
}

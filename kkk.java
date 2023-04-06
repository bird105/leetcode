import java.util.Scanner;

public class kkk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int temp=0,index=0,c=1;
        StringBuilder builder = new StringBuilder("");
        while(x>0){
            temp=0;
            for (int i = 1; i < 1000000; i++) {
                temp+=i;
                if(temp>x){
                    temp-=i;
                    index=i-1;
                    break;
                }
            }// 这段可以用（n+1）*n/2替换
            if(c==1){
                for (int i = 0; i < index; i++) {
                    builder.append("r");
                }
                c++;
            }else if(c==2){
                for (int i = 0; i < index; i++) {
                    builder.append("e");
                }
                c++;
            }else {
                for (int i = 0; i < index; i++) {
                    builder.append("d");
                }
                c=1;
            }
            x=x-temp;
        }
        System.out.println(builder.toString());
    }
}

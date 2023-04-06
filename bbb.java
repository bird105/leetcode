import java.util.Scanner;

public class bbb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = str.length();
        int left=0,right=n-1,cnt=0;
        char[] all = str.toCharArray();
        while(left < right){
            if(all[left] != all[right] && cnt<2){
                if(all[left] < all[right]){
                    all[right] = all[left];
                    cnt++;left++;right--;
                }else{
                    all[left] = all[right];
                    cnt++;left++;right--;
                }
            }else{
                left++;right--;
            }
        }
        left=0;right=n-1;
        if(cnt==0&&left<right){
            while (all[left] =='a'){
                left++;right--;
            }
            all[left] = 'a';
            all[right] = 'a';
        }else if(cnt == 1 && n%2 !=0){
            all[n/2] = 'a';
        }
        System.out.println(new String(all));
    }
}

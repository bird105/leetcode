import java.util.*;

import static java.util.stream.Collectors.toList;

public class e {
    public static void main(String[] args) {
        // 输入
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            num[i] = tmp;
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < tmp; j++) {
                temp.add(in.nextInt());
            }
            map.put(i,temp);
        }
        // 处理
        int count = 0;
        while (result.size() > 0){
            Jiaoji(result,map);
            count += 1;
        }
        System.out.println(count);
    }
    public static void Jiaoji(List<Integer> result,Map<Integer, List<Integer>> map){
        int maxLength = 0;
        int maxKey = 0;
        List<Integer> maxJiaoji = new ArrayList<>();
        for (int key:map.keySet()){
            List<Integer> strings = result.stream()
                    .filter(item -> map.get(key).contains(item))
                    .collect(toList());
            if (strings.size() > maxLength){
                maxKey = key;
                maxLength = strings.size();
                maxJiaoji = strings;
            }
        }
        result.remove(maxKey);
        result.removeAll(maxJiaoji);
        map.remove(maxKey);
    }
}

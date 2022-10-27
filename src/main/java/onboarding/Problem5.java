package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        answer = new ArrayList<>(8);
        answer = getCountBill(answer, money);
        return answer;
    }

    public static List<Integer> getCountBill(List<Integer> answer, int money){
        List<Integer> billList = Arrays.asList(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);
        List<Integer> res = answer;
        int tmp = money;
        for(int bill : billList) {
            answer.add(tmp / bill);
            tmp %= bill;
        }
        return res;
    }


}

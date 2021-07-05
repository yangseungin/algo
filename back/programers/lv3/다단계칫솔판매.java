package lv3;

import java.util.Arrays;
import java.util.HashMap;

public class 다단계칫솔판매 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
                new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
                new String[]{"young", "john", "tod", "emily", "mary"},
                new int[]{12, 4, 2, 5, 10})));
    }

    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, Person> people = new HashMap<>();
        int[] answer = new int[enroll.length];

        people.put("-", new Person("-"));
        for (int i = 0; i < enroll.length; i++) {
            people.put(enroll[i], new Person(enroll[i]));
        }

        for (int i = 0; i < referral.length; i++) {
            people.get(enroll[i]).parent = people.get(referral[i]);
        }

        for (int i = 0; i < seller.length; i++) {
            addAmount(people.get(seller[i]), amount[i] * 100);
        }

        for (int i = 0; i < enroll.length; i++) {
            answer[i] = people.get(enroll[i]).amount;
        }

        return answer;
    }

    public static void addAmount(Person person, int amount) {
        int share = amount / 10;
        if (share != 0 && person.parent != null) {
            person.amount += amount - share;
            addAmount(person.parent, share);
        } else {
            person.amount += amount;
        }
    }

    static class Person {
        String name;
        Person parent;
        int amount;

        public Person(String name) {
            this.name = name;
            this.parent = null;
            this.amount = 0;
        }
    }
}

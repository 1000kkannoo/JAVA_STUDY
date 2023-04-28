package ch06;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        // 데이터의 중복을 허용하지 않음
        HashSet<String> hashSet = new HashSet<>();

        // add 한 순서대로 element 가 나오지 않음
        hashSet.add(new String("김유신"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("홍길동"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("김유신"));

        System.out.println(hashSet);
    }
}

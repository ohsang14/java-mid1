package lang.string.test;

import com.sun.source.tree.LiteralTree;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 코드 작성

        // 분리하기
        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }
        // 합치기
        String joinedString = String.join("->" , splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}

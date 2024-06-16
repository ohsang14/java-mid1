package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 가변 (변경가능) String 생성 , StringBuilder -> 가변 생성
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder - > String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
    // `StringBuilder` 는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면
    //  안전한(불변) `String` 으로 변환하는 것이 좋다.
}

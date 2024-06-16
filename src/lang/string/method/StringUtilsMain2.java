package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // format 메서드
        String format1 = String.format("num: %d , bool: %b, str: %s ", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        // printf
        System.out.printf("숫자: %.3f\n", 10.1234);

        // matches 메서드 // 정규 표현식 ( 필요하면 따로 공부해야함)
        // "Hello, Java!"
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}

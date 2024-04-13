package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2 " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println('b');
    }
}

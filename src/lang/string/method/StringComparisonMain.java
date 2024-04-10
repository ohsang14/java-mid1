package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, Java!"; // 대문자 없음 모두 소문자
        String str3 = "hello, World!";

        System.out.println("str1 equals str2 " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));
    }
}

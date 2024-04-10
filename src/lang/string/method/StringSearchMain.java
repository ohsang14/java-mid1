package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world";

        System.out.println("문자열에 'JAVA'가 포함되어 있는지: " +
                str.contains("JAVA"));
        System.out.println("'JAVA'의 첫 번쨰 인덱스: " + str.indexOf("Java"));
    }
}

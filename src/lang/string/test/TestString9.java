package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성

        String [] parts = email.split("@");
        String idPart = parts[0];
        String domainPart = parts[1];

        System.out.println("ID = " + idPart);
        System.out.println("Domain: " + domainPart);
    }
}

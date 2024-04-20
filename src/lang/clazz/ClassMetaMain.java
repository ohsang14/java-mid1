package lang.clazz;

public class ClassMetaMain {
    public static void main(String[] args)  {
        // Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        // Class clazz1 =new String().getClass(); // 2.인스턴스에서 조회
        Class clazz2 = Class.forName("java.lan" +
                "g.String");

    }
}

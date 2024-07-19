package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        // NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());

        // 정적 중첩 클래스는 다른 클레스를 중첩해둔것임.
    }
}

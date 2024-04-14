package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //primitive -> wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

        // Wrapper - > Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-UnBoxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

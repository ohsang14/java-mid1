package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
public ImmutableObj add(int addValue){
        int result  = value + addValue;
        return new ImmutableObj(result); // 새로운 객체 생성
}

    public int getValue() {
        return value;
    }

}

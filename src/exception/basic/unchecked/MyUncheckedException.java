package exception.basic.unchecked;

/**
 *  RunTimeException을 상속바든 예외는 언체크 예외가 된다.
 */
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}

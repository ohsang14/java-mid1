package nested.inner.ex1;

// Car에서만 사용
public class Car {
    private String model;
    private int changeLevel;
    private Engine engine;

    public Car(String model, int changeLevel) {
        this.model = model;
        this.changeLevel = changeLevel;
        this.engine = new Engine(this);
    }
    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }
    // Engine에서만 사용하는 메서드
    public int getChangeLevel() {
        return changeLevel;
    }
    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}

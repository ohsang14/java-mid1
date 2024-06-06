package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paraVar) {
        int localVar = 1;


        class LocalPrinter implements Printer{
            int value = 0;


            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("pramVar = " + paraVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();

    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}

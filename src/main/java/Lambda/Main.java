//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Handler lambda3 = value -> {
            if (4 > value){
                System.out.println(value);
            }
        };

        Handler anonymousClass = new Handler() {
            public void handle(double value) {
                if(4 > value) {
                    System.out.println(value);
                }
            }
        };

        juggleWithNumbers(anonymousClass);

        juggleWithNumbers(lambda3);
    }


    public static void juggleWithNumbers(Handler handler) {
        double values[] = { 1.0, 5.0, 3.0 };
        for (double v : values) {
            handler.handle(v);
        }
    }
}
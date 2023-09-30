public class Main {
    public static void main(String[] args) {
      ArithmeticCalculator ac =new ArithmeticCalculator();
        System.out.println(ac.calculate(Operation.ADD,150,565));
        System.out.println(ac.calculate(Operation.MULTIPLY,150,565));
        System.out.println(ac.calculate(Operation.SUBTRACT,150,565));
    }
}
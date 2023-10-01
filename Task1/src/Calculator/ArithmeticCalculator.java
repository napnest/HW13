package Calculator;

public class ArithmeticCalculator {
    private double a;
    private double b;

    ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;

    }

    double calculate(Operation operation) {
        double result = 0;
        switch (operation) {
            case ADD:
                result = a + b;
                break;
            case SUBTRACT:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            default:
                System.out.println("Неправильный ввод");
                break;
        }
        return result;
    }
}



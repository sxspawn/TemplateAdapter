import ru.kovbasa.calculator.Ints;
import ru.kovbasa.calculator.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(22, 13));
        System.out.println(calc.mult(12, 53));
        System.out.println(calc.pow(5, 13));
    }
}
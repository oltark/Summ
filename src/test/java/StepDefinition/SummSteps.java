package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;


public class SummSteps {

    private Calculator calc;

double a,b, result;

          @Дано("^два числа (\\d) и (\\d)")
    public void given (double a, double b) {
              this.a = a;
              this.b = b;
              this.calc = new Calculator();

          }

          @Тогда("^ищем сумму двух чисел")
    public void when () {
              result = calc.sum(a,b);
              System.out.println("Сумма двух чисел: " + result);
          }

          @Когда("^результат должен быть (\\d)")
    public void then (double res) {

              Assert.assertEquals(res, result, 0.0001);

          }




}

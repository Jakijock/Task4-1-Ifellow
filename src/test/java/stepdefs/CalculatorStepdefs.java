package stepdefs;

import io.cucumber.java.ru.Когда;

public class CalculatorStepdefs {

    @Когда("складываем числа: Первое число = {int}, Второе число = {int}")
    public void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    @Когда("вычитаем числа: Первое число = {int}, Второе число = {int}")
    public void diff(int num1, int num2) {
        int diff = num1 - num2;
        System.out.println(diff);
    }

    @Когда("перемножаем числа: Первое число = {int}, Второе число = {int}")
    public void inc(int num1, int num2) {
        int inc = num1 * num2;
        System.out.println(inc);
    }


    @Когда("делим числа: Первое число = {int}, Второе число = {int}")
    public void div(int num1, int num2) {
        double inc = (double) num1 / num2;
        System.out.println(inc);
    }
}

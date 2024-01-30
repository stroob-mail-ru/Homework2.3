package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "<h3>Добро пожаловать в калькулятор</h3>";
    }

    @Override
    public String plus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<h3>Введите 2 числа</h3>";
        } else {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            return "<h3>" + number1 + " + " + number2 + " = " + (number1 + number2) + "</h3>";
        }
    }

    @Override
    public String minus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<h3>Введите 2 числа</h3>";
        } else {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            return "<h3>" + number1 + " - " + number2 + " = " + (number1 - number2) + "</h3>";
        }
    }

    @Override
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<h3>Введите 2 числа</h3>";
        } else {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            return "<h3>" + number1 + " * " + number2 + " = " + (number1 * number2) + "</h3>";
        }
    }

    @Override
    public String divide(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<h3>Введите 2 числа</h3>";
        } else {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            if (number2 == 0) {
            return "<h3>На ноль делить нельзя</h3>";
            } else {
                return "<h3>" + number1 + " / " + number2 + " = " + (number1 / number2) + "</h3>";
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1buitruongminhtuan;

/**
 *
 * @author BTMT
 * @Date 19/08/2016
 */
public class CalculateTwoNumbers {

    double number1;
    double number2;
    double result;

    public CalculateTwoNumbers() {
        number1 = 0;
        number2 = 0;
        result = 0;

    }

    public CalculateTwoNumbers(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    //calculate 2 numbers
    public double calculater(int calculation) {
        switch (calculation) {
            case 1://Add 2 number
                result = number1 + number2;
                break;
            case 2:// number1 subtract number2
                result = number1 - number2;
                break;
            case 3:// number1 multiplication number2
                result = number1 * number2;
                break;
            case 4:// number1 divide number2

                try {
                    result = number1 / number2;
                } catch (ArithmeticException AE) {
                    System.out.println(AE.toString());
                }
                break;
            default:
                System.out.println("Only input 1 to 4!");
                break;
        }
        return result;
    }

}

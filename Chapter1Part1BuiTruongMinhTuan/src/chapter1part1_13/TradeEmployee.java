
package chapter1part1_13;

import chapter1part1_6.StaffSalary;
import java.io.IOException;


/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class TradeEmployee extends StaffSalary {

    public TradeEmployee() {
    }

    float salaryTrade;
    float rateSalaryTrade;

    @Override
    public void inputInformationStaff() throws IOException {
        super.inputInformationStaff(); //To change body of generated methods, choose Tools | Templates.
        boolean check = true;
        while (check) {
            try {
                System.out.println("salary Trade:");
                salaryTrade =Float.parseFloat(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        check = true;
        while (check) {
            try {
                System.out.println("rate Salary Trade:");
                rateSalaryTrade =Float.parseFloat(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
    }

    @Override
    public float computeSalary() {
        this.income = this.coefficientsSalary * this.basicSalary  + (salaryTrade*rateSalaryTrade);
        incomeTax = income - basicTax - amountOfPeopleReduce * basicReduce;
        if (incomeTax < 0) {
            incomeTax = 0;
        }
        computePersonalIncomeTax(incomeTax);
        this.realSalary = income - personalIncomeTax;
        return this.realSalary;
    }
    
    @Override
    public void outputInformationStaff() {
       System.out.println("Information Trade Employyee:");
        System.out.println("income :" + coefficientsSalary + " * " + basicSalary + " + " + (salaryTrade*rateSalaryTrade) + " = " + income);
        System.out.println("income Tax :" + income + " - " + basicTax + " - " + amountOfPeopleReduce + " * " + basicReduce + " = " + incomeTax);
        System.out.println("personal Income Tax :" + personalIncomeTax);
        System.out.println("real Salary :" + income + " - " + personalIncomeTax + " = " + realSalary);
    }

    public float getSalaryTrade() {
        return salaryTrade;
    }

    public void setSalaryTrade(float salaryTrade) {
        this.salaryTrade = salaryTrade;
    }

    public float getRateSalaryTrade() {
        return rateSalaryTrade;
    }

    public void setRateSalaryTrade(float rateSalaryTrade) {
        this.rateSalaryTrade = rateSalaryTrade;
    }
    
}

package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _7_SalaryAndTaxComputation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Double> details = Arrays.stream(inputString.split(",")).map(Double::parseDouble).collect(Collectors.toList());
        ComputeSalaryAndTax(details.get(0), details.get(1), details.get(2));
        in.close();
    }

    private static void ComputeSalaryAndTax(Double salary, Double transportAllowance, Double houseAllowance) {
        //Calculating Net Salary
        Double grossSalary = salary + transportAllowance + houseAllowance;
        Double netSalary = grossSalary;
        if (grossSalary > 55000)
            netSalary = (grossSalary - ((8.2 * grossSalary) / 100));
        System.out.println("Net Salary : " + netSalary);
    }
}

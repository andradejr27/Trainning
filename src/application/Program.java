package application;

import java.util.Scanner;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many hours the employee work? ");
		double ht = sc.nextDouble();
		System.out.print("How much cost the employee hour? ");
		double vh = sc.nextDouble();
		System.out.print("What is the percentual of the discount? ");
		double pd = sc.nextDouble();
		System.out.println();
		Employee employee = new Employee(ht, vh, pd);
		
		System.out.println("Worked hours: " + employee.getHt());
		System.out.println("Gross salary: " + employee.salarioBruto(ht, vh));
		System.out.println("Discounts:" + employee.getPd());
		System.out.println("Liquid salary: " + employee.salarioLiquido(employee.salarioBruto(ht, vh) - employee.percentualDesconto(pd, employee.salarioBruto(ht, vh))));
		
		sc.close();
	}

}

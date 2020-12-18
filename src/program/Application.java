package program;

import java.util.Locale;
import java.util.Scanner;
import employee.Employee;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.println("entre com o nome");
		emp.name = sc.nextLine();

		System.out.println("entre com o salário bruto");
		emp.grossSalary = sc.nextDouble();

		System.out.println("entre com o percentual de impostos");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee:" + emp);
		System.out.println();

		System.out.println("Entre com o percentual de aumento: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println("Dados atualizados:" + emp);

		sc.close();
	}

}

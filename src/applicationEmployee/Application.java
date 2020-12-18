package applicationEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitiesEmployee.employee;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<employee> list = new ArrayList<>();

		System.out.print("How many employee well be registered: ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("EMPLOYEE #" + (i + 1) + "\n");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("NAME: ");
			String name = sc.nextLine();
			System.out.print("SALARY: ");
			Double salary = sc.nextDouble();

			employee emp = new employee(id, name, salary);
			
			list.add(emp);
		}

		System.out.println();
		System.out.println("Enter the employee id that well have salary increase:");

		Integer idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);

		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}

		for (employee e : list) {
			System.out.println(e);
		}

		sc.close();
	}

	public static Integer position(List<employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}

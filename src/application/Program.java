package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Worker> worker = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		Integer n = sc.nextInt();
				
		for (int i=0; i<n ; i++) {
			System.out.printf("\nEmplyoee #%d:\n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();	
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			worker.add(new Worker(id, name, salary));
		}
		
		System.out.println('\n' + "Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Worker wor = worker.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (wor != null) {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			wor.setSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		for (Worker list : worker ) {
			System.out.println(list);
		}
		
		sc.close();
	}

}

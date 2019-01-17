package entities;

public class Worker {
	private Integer id;
	private String name;
	private Double salary;

	public Worker() {
		
	}
	
	public Worker(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double percentage) {
		salary = salary + (salary * (percentage/100));
	}
	
	public String toString() {
		return id 
				+", "
				+ name
				+", "
				+ String.format("%.2f", salary);
	}
			
}
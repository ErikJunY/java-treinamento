package entities;

public class Lista_funcionario {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Lista_funcionario() {
		
	}
	
	public Lista_funcionario(Integer id, String name, Double salary) {
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

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void aumento(double porcentagem) {
		this.salary += salary * porcentagem/100;
	}
	
	public String toString(){
			return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}

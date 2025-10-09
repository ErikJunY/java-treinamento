package entities;

public abstract class Person {
	
	private String name;
	private double renda;
	
	
	public Person() {
	}

	public Person(String name, double renda) {
		this.name = name;
		this.renda = renda;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRenda() {
		return renda;
	}

	public abstract double calculoImposto();
	
}

package entities;

public class IndividualPerson extends Person{
	
	private double healthExpenses;
	
	public IndividualPerson() {
	}

	public IndividualPerson(String name, double renda, double healthExpenses) {
		super(name, renda);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	@Override
	public double calculoImposto() {
		if (super.getRenda() < 20000.00) {
			return super.getRenda() * 0.15 - (this.healthExpenses * 0.5); 
		}
		else {
			return super.getRenda() * 0.25 - (this.healthExpenses * 0.5); 
		}	
	}
}

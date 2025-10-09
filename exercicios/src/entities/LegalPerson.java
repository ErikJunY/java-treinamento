package entities;

public class LegalPerson extends Person{
	
	private int funcionarios;
	
	public LegalPerson() {
	}
	
	public LegalPerson(String name, double renda, int funcionarios) {
		super(name, renda);
		this.funcionarios = funcionarios;
	}
	
	public int getFuncionarios() {
		return funcionarios;
	}

	@Override
	public double calculoImposto() {
		if (this.funcionarios > 10) {
			return this.getRenda() * 0.14;
		}
		else {
			return this.getRenda() * 0.16;
		}
	}

}

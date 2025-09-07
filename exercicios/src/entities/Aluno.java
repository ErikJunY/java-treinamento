package entities;

public class Aluno {

		public String nome;
		public double nota1;
		public double nota2;
		public double nota3;
		
		public double notafinal() {
			return nota1 + nota2 + nota3;
		}
		
		public String aprovado() {
			double notaf = notafinal();
			if (notaf >= 60) {
				return "PASS";
			}
			else {
				return "FAILED";
			}
		}
		
		public String falta() {
			if (notafinal() < 60) {
			return String.format("Missing %.2f Points", (60 - notafinal()));
			}
			else {
				return "";
			}
		}
		
		public String toString() {
			return "Final Grade = " + String.format("%.2f", notafinal()) + "\n" +
					aprovado() + "\n" +
					falta();
		}
		
		
}

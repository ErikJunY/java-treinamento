package entities; 

public class Clientes {
    
    private int id;
    private String nome;
    private String email;
    private int idade;

    
    public Clientes(int id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    public Clientes() {
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
    public int getIdade() {
		return idade;
	}

	public String toString() {
        return id + " - " + nome + " - " + email;
    }
}

package application; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/pizzaria"; 
        String user = "root"; 
        String password = "Dacco0202!"; 

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            System.out.print("Você já é cliente? (s/n): ");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Digite seu nome completo: ");
                String nome = sc.nextLine();

                ResultSet rs = st.executeQuery("SELECT * FROM clientes WHERE nome = '" + nome + "'");

                if (rs.next()) {
                    System.out.println("Bem-vindo " + rs.getString("nome") + ", pode seguir com seu pedido.");
                } else {
                    System.out.println("Cliente não encontrado!");
                }
                rs.close();

            } else {
                System.out.print("Digite seu nome completo: ");
                String nome = sc.nextLine();
                System.out.print("Digite seu email: ");
                String email = sc.nextLine();
                System.out.print("Digite sua idade: ");
                int idade = sc.nextInt();

                st.executeUpdate("INSERT INTO clientes (nome, email, idade) VALUES ('" 
                                  + nome + "', '" + email + "', " + idade + ")");

                System.out.println("Bem-vindo " + nome + ", pode seguir com seu pedido.");
            }

            st.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

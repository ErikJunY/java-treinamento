
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestaMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/loja?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "erik";          // ou "root"
        String password = "dacco"; // sua senha

        String insertSql = "INSERT INTO clientes (nome, email, salario) VALUES (?, ?, ?)";
        String selectSql = "SELECT id, nome, email, salario FROM clientes";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conectado ao banco!");

            // Insert exemplo
            try (PreparedStatement ps = conn.prepareStatement(insertSql)) {
                ps.setString(1, "Teste Java");
                ps.setString(2, "teste@java.com");
                ps.setDouble(3, 1234.56);
                ps.executeUpdate();
            }

            // Select exemplo
            try (PreparedStatement ps2 = conn.prepareStatement(selectSql);
                 ResultSet rs = ps2.executeQuery()) {
                while (rs.next()) {
                    System.out.printf("%d - %s - %s - %.2f%n",
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getDouble("salario"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ContaCrudTeste {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try(Connection con = DriverManager.getConnection(url, "murilo", "niane")){
			ContaCRUD crud = new ContaCRUD();
			
			
			
			List<Conta> contas = crud.ler(con);
			
			for (Conta conta : contas) {
				System.out.println(conta);
			}
			
			Conta origem = contas.get(0);
			Conta destino = contas.get(1);
			
			crud.transferir(con, origem, destino, 100);
			
			contas = crud.ler(con);
			
			for (Conta conta : contas) {
				System.out.println(conta);
			}
			
			
			
		}

	}

}

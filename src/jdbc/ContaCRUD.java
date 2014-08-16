package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContaCRUD {
	
	
	public void transferir(Connection con, Conta origem, Conta destino, double valor) throws SQLException{
		if(origem.saldo >= valor){
			
			try{
				con.setAutoCommit(false);
				
				//saque
				origem.saldo -= valor;
				alterar(con, origem);
				
				//deposito
				destino.saldo += valor;
				alterar(con, destino);
				
				con.commit();
			} catch (Exception e){
				con.rollback();
			}
		}
	}
	
	public void criar(Connection con, Conta conta) throws SQLException{
		String sql = "insert into conta values (?,?,?)";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1,conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}
	}
	
	public List<Conta> ler(Connection con) throws SQLException{
		
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero,cliente,saldo from conta";
		
		try(PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
			
				while(rs.next()){
					lista.add(new Conta(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
				}
			
		}
		
		return lista;
		
	}
	
	public void alterar(Connection con, Conta conta) throws SQLException{
		String sql = "update conta set cliente = ?, saldo = ? where numero = ?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1,conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}
	}
	
	public void deletar(Connection con, Conta conta) throws SQLException{
		String sql = "delete conta where numero = ?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}
	}
	

}

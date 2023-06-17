package DAO;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexaojdbc.SingleConnection;
import model.Userposjava;

public class UserPosDAO {
	
	private Connection connection;
	
		public void UsePosDAO() {
			connection = SingleConnection.getConnection();
		}
		
		//metodo para salvar os dados
		public void salvar(Userposjava userposjava) {//recebendo o objeto com os dados como parametro
			
			try {
				
				String sql = "insert into userposjava (id, nome, email) values (?,?,?)";
				
				//prepared vai fazer o insert do sql para dentro do banco-- vai preparar o sql
				PreparedStatement insert = connection.prepareStatement(sql);
				
				//passando os dados aqui dentro do codigo
				insert.setLong(1, userposjava.getId());//na posicao 1 o valor 3, id entra 3
				insert.setString(2, userposjava.getNome());//na posicao 2, que é o nome valor egidio
				insert.setString(3, userposjava.getEmail());
				insert.execute();//vai executar
				
				//de dentro da conexao é dado o commit
				connection.commit();//salva no banco
				
			} catch (Exception e) {
				e.printStackTrace();//vai imprimir na tela caso aconteca um erro
			}
		}
		
		public List<Userposjava> listar() throws Exception{
			List<Userposjava> list = new ArrayList<Userposjava>();
			
			String sql = "select * from userposjava";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			while (resultado.next()) {
				Userposjava userposjava = new Userposjava();
				userposjava.setId(resultado.getLong("id"));
				userposjava.setNome(resultado.getString("nome"));
				userposjava.setEmail(resultado.getString("email"));
				
				list.add(userposjava);
				
				
			}
			
			return list;
		}
		
		public Userposjava buscar(Long id) throws Exception{
			Userposjava retorno = new Userposjava();
			
			String sql = "select * from userposjava where id = " + id;
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			while (resultado.next()) {
				
				retorno.setId(resultado.getLong("id"));
				retorno.setNome(resultado.getString("nome"));
				retorno.setEmail(resultado.getString("email"));
				
				
				
			}
			
			return retorno;
		}

		public Userposjava buscar(long id) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	



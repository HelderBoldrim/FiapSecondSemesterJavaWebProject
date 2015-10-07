package br.com.fiap.helpbox.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import oracle.sql.DATE;
import br.com.fiap.helpbox.beans.Objeto;
import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.conexao.ConexaoFactory;

/**
 * 
 * O DAO (data acess object) � um padr�o de acesso � dados, serve para 
 * desacoplar a camada de neg�cio. Nele tamb�m devem conter todas as 
 * informa��es de cada classe feita at� aqui. 
 * 
 * O DAO busca os dados do Banco de Dados e converte em objetos para
 * serem usados pela aplica��o. Tamb�m pega os obejtos, converte em SQL e 
 * manda para o Banco de Dados. � assim que o DAO trabalha. 
 * 
 * Temos um DAO para cada objeto feito do dom�nio do sistema.
 *
 * @author Beatriz Biserra rm74656
 * @author H�lder Alc�ntara rm74504
 * @author Thyago Pozzibon rm75064
 * @author Ulric Mergui�o rm73619
 * 
 * @version 1.0
 * @since 1.0 
 *
 */
public class UsuarioDAO {

	private Connection conexao;

	/**
	 * Utiilizamos a conex�o para conseguirmos conectar com o Banco MySQL.
	 * O throws Exception serve para que seja lan�ado o poss�vel erro para o 
	 * m�todo.
	 */
	
	public UsuarioDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}


	/**
	 * Em uma parte do CRUD primeiro  inserimos um ID do usu�rio e instanciamos. 
	 * Fizemos uma condi��o para que ao o usu�rio digitasse, o seu id fosse 
	 * adicionado conforme os n�meros dos cadastros. 
	 * 
	 * @return codigo do Usu�rio
	 * @throws Exception
	 * @see Usuario
	 */
	
		// CRUD + List
	public int acrescentadorID() throws Exception{
		String sql = "SELECT cd_usuario FROM T_HB_USUARIO";
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		ResultSet resultadoCod = estrutura.executeQuery();
		int cod = 0;
		Usuario user= new Usuario();
		
		if(resultadoCod.next()){
			 user.setCodigoUsuario(resultadoCod.getInt("cd_usuario"));
			cod = user.getCodigoUsuario();
			return cod = cod++;
		}
		return cod;
	}
	
	/**
	 * M�todo para criar, adicionar usu�rios. Recebeme como par�metro
	 * todos os atributos e tipos primitivos que declaramos na classe Beans. 
	 * Fizemos um insert para poder inserir todos os atributos existentes na
	 * tabela Usu�rio. Cada interroga��o � como um valor para ser acrescentado. 
	 * O prepared Statement permite criar os objetos utilizados para passagem de 
	 * comandos ao Banco de Dados. Usado quando a declara��o SQL tiver um ou 
	 * mais par�metros que podem ser enviados em conjunto.
	 * 
	 * @param nome
	 * @param sobrenome
	 * @param cpf
	 * @param rg
	 * @param dataNasc
	 * @param endereco
	 * @param cep
	 * @param telefone
	 * @param email
	 * @param senha
	 * @return true
	 * @throws SQLException
	 * @throws Exception
	 */
	
	// CRUD (Create)
	public boolean addUsuario(String nome,String sobrenome,String cpf,String rg,String dataNasc,String endereco,String cep,String telefone,String email,String senha) throws SQLException,Exception{
		String sql = "insert into T_HB_USUARIO (cd_usuario,nm_usuario, nm_sobrenome, nr_cpf, nr_rg, dt_nascimento, ds_endereco, nr_cep, nr_telefone, ds_email, ds_senha) values (?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		
		DateFormat fmt = new SimpleDateFormat("dd-mm-yy");
		Date data = new Date(fmt.parse(dataNasc).getTime());
		
		estrutura.setInt(1,acrescentadorID());
		estrutura.setString(2, nome);
		estrutura.setString(3, sobrenome);
		estrutura.setString(4, cpf);
		estrutura.setString(5, rg);
		estrutura.setDate(6, data);
		estrutura.setString(7, endereco);
		estrutura.setString(8, cep);
		estrutura.setString(9, telefone);
		estrutura.setString(10, email);
		estrutura.setString(11, senha);
		
		estrutura.execute();
		estrutura.close();
		return true;
	}
	
	/**
	 * 
	 * Mais um m�todo. Esse serve para ler. Pesquisar o email do nosso usu�rio. 
	 * O throws serve para que seja lan�ado o poss�vel erro para o 
	 * m�todo.
	 * Instanciamos a Classe Usu�rio. 
	 * O prepared Statement permite criar os objetos utilizados para passagem de 
	 * comandos ao Banco de Dados. Usado quando a declara��o SQL tiver um ou 
	 * mais par�metros que podem ser enviados em conjunto.
	 * Usamos o try e catch para detectar poss�veis erros durante a execu��o do 
	 * programa. No try � onde n�s colocamos os poss�veis erros.
	 *  Elas s�o capturas pelo catch. 
	 *  O finally � um bloco opcional e ele ocorre independentemente se ocorrer um 
	 *  erro ou n�o.   
	 *  
	 * @param email
	 * @return usuario
	 * @throws Exception
	 */
	
	// CRUD (Read)
	
	public  Usuario pesquisarUsuario(String email) throws Exception{
		Usuario usuario = new Usuario();
		PreparedStatement estrutura = this.conexao.prepareStatement("select * from T_HB_USUARIO WHERE ds_email = ?");
		estrutura.setString(1, email);
		ResultSet resultadoDados = estrutura.executeQuery();
		
		try{
		if(resultadoDados.next()){
			usuario.setCodigoUsuario(resultadoDados.getInt("cd_usuario"));
			usuario.setNome(resultadoDados.getString("nm_usuario"));
			usuario.setSobrenome(resultadoDados.getString("nm_sobrenome"));
			usuario.setCpf(resultadoDados.getString("nr_cpf"));
			usuario.setRg(resultadoDados.getString("nr_rg"));
			usuario.setDtNascimento(resultadoDados.getString("dt_nascimento"));
			usuario.setEndereco(resultadoDados.getString("ds_endereco"));
			usuario.setCep(resultadoDados.getString("nr_cep"));
			usuario.setTelefone(resultadoDados.getString("nr_telefone"));
			usuario.setEmail(resultadoDados.getString("ds_email"));
			usuario.setSenha(resultadoDados.getString("ds_senha"));
		}
		}catch(SQLException se){
			se.printStackTrace();
		}
		resultadoDados.close();
		estrutura.close();
		return usuario;
	}
	
	/**
	 * Neste m�todo, n�s estamos atualizando os dados do usu�rio. E como pode 
	 * perceber j� demos um throws Exception para que seja lan�ado o poss�vel
	 * erro para o m�todo.
	 * O prepared Statement permite criar os objetos utilizados para passagem de 
	 * comandos ao Banco de Dados. Usado quando a declara��o SQL tiver um ou 
	 * mais par�metros que podem ser enviados em conjunto.
	 * Cada interroga��o � como um valor para ser acrescentado/atualizado. 
	 * 
	 * @param usuario
	 * @return saida
	 * @throws Exception
	 */

	// CRUD (Update)
	
	public int atualizarUsuario(Usuario usuario) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement("update T_HB_USUARIO set nm_usuario=?, nm_sobrenome=?, nr_cpf=?, nr_rg=?, dt_nascimento=?, ds_endereco=?, nr_cep=?, nr_telefone=?, ds_email=?, ds_senha=? where cd_usuario=?");
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getSobrenome());
		stmt.setString(3, usuario.getCpf());
		stmt.setString(4, usuario.getRg());
		stmt.setString(5, usuario.getDtNascimento());
		stmt.setString(6, usuario.getEndereco());
		stmt.setString(7, usuario.getCep());
		stmt.setString(8, usuario.getTelefone());
		stmt.setString(9, usuario.getEmail());
		stmt.setString(10, usuario.getSenha());
		int saida = stmt.executeUpdate();
		stmt.close();
		return saida;
	}
	
	/**
	 * Criamos esse m�todo para deletar os atributos da classe Usu�rio referente
	 * a tebela Usu�rio. Passando o par�metro email para a busca no Banco.  
	 * 
	 * @param x
	 * @return saida
	 * @throws Exception
	 */
	
	// CRUD (Delete)
	
	public boolean deletarUsuario(String email) throws Exception,SQLException{
		PreparedStatement stmt = conexao.prepareStatement("delete from T_HB_USUARIO where ds_email = ? ");
		stmt.setString(1, email);
		stmt.executeUpdate();
		
		stmt.close();
		return true;
	}

	public boolean checkUser(String email)throws Exception,SQLException{
		
			Usuario usuario = new Usuario();
			PreparedStatement estrutura = this.conexao.prepareStatement("select * from T_HB_USUARIO WHERE ds_email = ?");
			estrutura.setString(1, email);
			ResultSet resultadoDados = estrutura.executeQuery();
			
			if(resultadoDados.next()){
				estrutura.close();
				return true;
			}else{
				estrutura.close();
				return false;
			}
 }
}

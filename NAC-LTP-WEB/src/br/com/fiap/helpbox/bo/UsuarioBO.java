package br.com.fiap.helpbox.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.dao.UsuarioDAO;

/**
 * Nesse pacote BO, criamos outra classe, chamada 'UsuarioBO'. 
 * 
 * Nele cont�m inst�ncias e atributos com outros objetos de neg�cios. 
 * 
 * Fizemos a cria��o do c�digo que acessar� o nosso Banco de Dados. E depois 
 * utilizamos o c�digo que foi utilizado  na classe criada na primeira parte. 
 * Colocamos o CRUD (Create Read Update Delete) com a classe Statement. 
 * 
 * @author Beatriz Bernardo Biserra rm74656
 * @author H�lder Alc�ntara rm74504 
 * @author Thyago Pozzybon rm75064
 * @author Ulric Mergui�o rm73619
 * 
 * @version 1.0
 * @since 1.0
 *
 */

public class UsuarioBO {
	
	UsuarioDAO ud;
	Usuario ub;
	
	/**
	* M�todo feito para a cria��o de um novo usu�rio, acompanhado por seus tipos 
	* primitivos e atributos, respectivamente. 
	* 
	* @param nome
	* @param sobrenome
	* @param cpf
	* @param rg
	*  
	* @param dataNasc
	* @param endereco
	* @param cep
	* @param telefone
	* @param email
	* @param senha
	* @return depende da condi��o.
	* @throws Exception
	* 
	*/		

	// CRUD (Create)
	public boolean novoUsuario(String nome,String sobrenome,String cpf,String rg,String dataNasc,String endereco,String cep,String telefone,String email,String senha) throws Exception{
	
		ud = new UsuarioDAO();
		
		if(ud.addUsuario(nome,sobrenome,cpf,rg,dataNasc,endereco,cep,telefone,email,senha)==true){
			
			return true;
			
		}else{
			return false;
		}

		
	}
	
	public UsuarioBO() {
		super();
		
	}
	
	/**
	 * 
	 * M�todo READ, para consultar um Usu�rio em nosso Cadastro atrav�s de seu 
	 * email. 
	 * O throws Exception serve para que seja lan�ado o poss�vel erro para o 
	 * m�todo.
	 * 
	 * @param email
	 * @return email 
	 * @throws Exception
	 * 
	 */

	// CRUD (Read)
	public Usuario consultarUsuario(String email) throws Exception{
	 return new UsuarioDAO().pesquisarUsuario(email);

	}
	
	/**
	 * 
	 * M�todo UPDATE, para alterar/atualizar um dado do nosso usu�rio. 
	 * Vai retornar a altera��o que ele realizou. 
	 * 
	 * @param u
	 * @return u
	 * @throws Exception
	 * 
	 */
	
	// CRUD (Update)
	public int alterarUsuario(Usuario u) throws Exception{
		return new UsuarioDAO().atualizarUsuario(u);
	}
	
	/**
	* 
	*Criamos esse m�todo para deletar os atributos da classe Usu�rio referente
	*a tebela Usu�rio. Passando o par�metro para a busca no Banco de dados. 
	* 
	*@param u
	*@return u
	*@throws Exception
	* 
	*/
	// CRUD (Delete)
	public boolean excluirUsuario(String email) throws Exception, SQLException{
		if(new UsuarioDAO().deletarUsuario(email)){
			return true; 
		}else{
		return false;
		}
	}
	
	
		
}

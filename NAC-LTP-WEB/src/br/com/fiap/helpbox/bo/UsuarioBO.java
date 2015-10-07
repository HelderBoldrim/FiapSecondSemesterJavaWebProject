package br.com.fiap.helpbox.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.dao.UsuarioDAO;

/**
 * Nesse pacote BO, criamos outra classe, chamada 'UsuarioBO'. 
 * 
 * Nele contém instâncias e atributos com outros objetos de negócios. 
 * 
 * Fizemos a criação do código que acessará o nosso Banco de Dados. E depois 
 * utilizamos o código que foi utilizado  na classe criada na primeira parte. 
 * Colocamos o CRUD (Create Read Update Delete) com a classe Statement. 
 * 
 * @author Beatriz Bernardo Biserra rm74656
 * @author Hélder Alcântara rm74504 
 * @author Thyago Pozzybon rm75064
 * @author Ulric Merguiço rm73619
 * 
 * @version 1.0
 * @since 1.0
 *
 */

public class UsuarioBO {
	
	UsuarioDAO ud;
	Usuario ub;
	
	/**
	* Método feito para a criação de um novo usuário, acompanhado por seus tipos 
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
	* @return depende da condição.
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
	 * Método READ, para consultar um Usuário em nosso Cadastro através de seu 
	 * email. 
	 * O throws Exception serve para que seja lançado o possível erro para o 
	 * método.
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
	 * Método UPDATE, para alterar/atualizar um dado do nosso usuário. 
	 * Vai retornar a alteração que ele realizou. 
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
	*Criamos esse método para deletar os atributos da classe Usuário referente
	*a tebela Usuário. Passando o parâmetro para a busca no Banco de dados. 
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

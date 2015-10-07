package br.com.fiap.helpbox.bo;

import java.util.List;

import br.com.fiap.helpbox.beans.Objeto;
import br.com.fiap.helpbox.dao.ObjetoDAO;

/**
 * Nesse pacote BO, criamos uma classe chamada 'ObjetoBO'. 
 * Objeto de Negócios (BO) são usados em programação orientada a objeto,
 * ele é uma representação de partes de um negócio, que pode representar uma 
 * pessoa, um lugar, um objeto etc. 
 * 
 * Um BO também pode fazer parte solicitações de dados do cliente para o DAO. 
 * 
 * 
 * @author Beatriz Bernardo Biserra rm74656
 * @author Hélder Alcântara rm74504
 * @author Thyago Pozzibon rm75064
 * @author Ulric Merguiço rm73619
 *
 * @version 1.0
 * @since 1.0
 * 
 */



public class ObjetoBO {

	
		// CRUD + List

	public ObjetoBO() {
			super();
			// TODO Auto-generated constructor stub
		}

	/**
	 * 
	 * @param o
	 * @return
	 * @throws Exception
	 */
	
	// CRUD (Create)
	
	public boolean novoObjeto(Objeto o) throws Exception{
// pessoa precisa estar cadastrada
		if(new ObjetoDAO().addObjeto(o)==true){
			return true;
		}else{
			return false;
		}
	}

	// CRUD (Read)
	//public Objeto consultarObjeto(String o) throws Exception{
	//	return new ObjetoDAO().pesquisarObjeto(o.toUpperCase());
//	}

	// CRUD (Update)
	//public int (String o) throws Exception{
		//return new ObjetoDAO().
	//}

	// CRUD (Delete)
	//public int excluirObjeto(String o) throws Exception{
		//return new ObjetoDAO().deletarObjeto(o);
//	}

	// List
//	public List<Objeto> listarObjetos() throws Exception{
	//	return new ObjetoDAO().listObjeto();
//	}

}

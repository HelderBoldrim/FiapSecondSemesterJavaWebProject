package br.com.fiap.helpbox.testes;

import br.com.fiap.helpbox.conexao.ConexaoFactory;

     /**
 	 * 
 	 * @author Beatriz Bernardo Biserra rm74656
 	 * @author H�lder Alc�ntara rm74504
 	 * @author Thyago Pozzibon rm75064
 	 * @author Ulric Mergui�o rm73619
	 * @version 1.0
	 * @since 1.0
	 *
	 */

public class Teste {

	public static void main(String[] args) throws Exception {
		ConexaoFactory cf;
		new ConexaoFactory().getConnection();
		
		
		System.out.println("Abriu cone��o");
	}
}

package br.com.fiap.helpbox.excecao;

	/**
	 * Quando criamos um programa, há possibilidade de ocorrer uma série de erros ou imprevistos
	 * durante a execução. Esses erros são chamados de Exceções. 
	 * 
	 * 
	 * @author Beatriz Bernardo Biserra rm74656
	 * @author Hélder Alcântara rm74504
	 * @author Thyago Pozzibon rm75064
	 * @author Ulric Merguiço rm73619
	 * @version 1.0
	 * @since 1.0
	 * 
	 *
	 */

public class Excecao extends Exception{
	public Excecao(String mensagem, Exception e){
		super(mensagem, e);
		this.print();
		e.printStackTrace();
		//Envia e-mail para o responsável
	}
	public Excecao(String mensagem){
		super(mensagem);
		//Envia e-mail para o responsável
	}
	public Excecao(Exception e){
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("Número inválido!");
		}else{
			System.out.println("Erro fatal!");
			e.printStackTrace();
		}
	}

	public void print(){
		System.out.println("========== Tratando erro ==========");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace:  ");
	}

}

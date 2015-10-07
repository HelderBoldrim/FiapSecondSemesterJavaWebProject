package br.com.fiap.helpbox.excecao;

	/**
	 * Quando criamos um programa, h� possibilidade de ocorrer uma s�rie de erros ou imprevistos
	 * durante a execu��o. Esses erros s�o chamados de Exce��es. 
	 * 
	 * 
	 * @author Beatriz Bernardo Biserra rm74656
	 * @author H�lder Alc�ntara rm74504
	 * @author Thyago Pozzibon rm75064
	 * @author Ulric Mergui�o rm73619
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
		//Envia e-mail para o respons�vel
	}
	public Excecao(String mensagem){
		super(mensagem);
		//Envia e-mail para o respons�vel
	}
	public Excecao(Exception e){
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("N�mero inv�lido!");
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

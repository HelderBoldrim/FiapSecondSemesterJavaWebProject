package br.com.fiap.helpbox.beans;

	/**
	 * Nesse pacote Beans, criamos uma classe chamada Objetos e colocamos
	 * os atributos que achamos necess�rio para o cadastro dos mesmos. 
	 * 
	 * A frente de cada atributo, colocamos os seus respectivos tipos primitivos.
	 * 
	 * Para criar uma classe � necess�rio criar um m�todo construtor com o mesmo
	 * nome da classe. Cada vez que criamos um objeto/atributo ele deve ser 
	 * adicionado.
	 * 
	 * Abaixo de cada atributo feito, geramos os getter's and setter's. Eles
	 * servem para pegarmos as informa��es de vari�veis da classe Objeto que s�o
	 * definidas como "private", por�m esses m�todos s�o definidos como "public".
	 * 
	 * As vari�veis "privates" s� s�o vis�veis dentro da pr�pria classe. 
	 *  
	 * @author Beatriz Bernardo Biserra rm74656
	 * @author H�lder Alc�ntara rm74504
	 * @author Thyago Pozzibon rm75064
	 * @author Ulric Mergui�o rm73619
	 * @version 1.0
	 * @since 1.0
	 * 
	 */

public class Objeto {
	
//	private int codigoObjeto;
//	private String tipoObjeto;
//	private String descricao;
//	private String quantidade;
//	private String peso;
//	private String tamanho;
	
	private int codigoObjeto;
	private String tipoObjeto;
	private String descricao;
	private String quantidade;
	private String estado;
	private String genero;
	
	
	public Objeto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Objeto(String tipoObjeto, String descricao,
			String quantidade, String estado, String genero) {
		super();
		this.codigoObjeto = codigoObjeto;
		this.tipoObjeto = tipoObjeto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estado = estado;
		this.genero = genero;
	}
	public int getCodigoObjeto() {
		return codigoObjeto;
	}
	public void setCodigoObjeto(int codigoObjeto) {
		this.codigoObjeto = codigoObjeto;
	}
	public String getTipoObjeto() {
		return tipoObjeto;
	}
	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

	
	
	
	
	
}
	

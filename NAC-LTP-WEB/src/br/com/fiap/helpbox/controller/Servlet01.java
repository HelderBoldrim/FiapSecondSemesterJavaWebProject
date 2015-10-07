package br.com.fiap.helpbox.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.misc.Perf.GetPerfAction;
import br.com.fiap.helpbox.beans.Objeto;
import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.bo.ObjetoBO;
import br.com.fiap.helpbox.bo.UsuarioBO;
import br.com.fiap.helpbox.dao.UsuarioDAO;

@WebServlet("/Servlet01")

public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void inserirCadastro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	public Servlet01() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{

			Objeto obj;
			ObjetoBO ob= new ObjetoBO();
			Usuario user;
			UsuarioBO ub = new UsuarioBO();

			if(request.getParameter("form").equals("cadastroDoacao")){
				String email = request.getParameter("email");
				String tipoDoacao = request.getParameter("tipo");
				String desc = request.getParameter("descricao");				
				String qtd = request.getParameter("qtd");
				String estado = request.getParameter("estado");
				String genero = request.getParameter("genero");
				obj = new Objeto(tipoDoacao, desc, qtd, estado, genero);
				UsuarioDAO ud = new UsuarioDAO();
				if(ud.checkUser(email)==true){

					if(ob.novoObjeto(obj)==true){
						request.setAttribute("msg", "Doação realizada com sucesso!!  O mundo agradece");
						request.getRequestDispatcher("doacao.jsp").forward(request, response);
					}else{
						request.getRequestDispatcher("SaidaNegativa.jsp").forward(request, response);
					}

				}else{
					request.setAttribute("msg", "Você ainda não possui cadastro");
					request.getRequestDispatcher("SaidaNegativa.jsp").forward(request, response);
				}

				//metodo excluir
			}else if(request.getParameter("form").equals("excluir")){
				String email = request.getParameter("excluirUser");
				if(ub.excluirUsuario(email)== true){
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}else{
					request.getRequestDispatcher("SaidaNegativa.jsp").forward(request, response);;
				}




			}else if(request.getParameter("form").equals("alterar")){
				String email = request.getParameter("alterarUser");
				UsuarioDAO ud= new UsuarioDAO();
				if(ud.checkUser(email)){
					user = ub.consultarUsuario(email);
					request.setAttribute("user", user);
					request.getRequestDispatcher("AlteracaoCadastro.jsp").forward(request, response);
				}else{
					request.setAttribute("msg", "Você ainda não possui Cadastro");
					request.getRequestDispatcher("SaidaNegativa.jsp").forward(request, response);
				}
			}else{
				request.getRequestDispatcher("SaidaNegativa.jsp").forward(request, response);
			}
		}catch (Exception e){
			e.printStackTrace();
		}	
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get parâmetros
		try{
			String nome = request.getParameter("nome");
			String sobrenome = request.getParameter("sobrenome");
			String cpf = request.getParameter("cpf");
			String rg = request.getParameter("rg");
			String dataNasc = request.getParameter("dataNasc");
			String endereco = request.getParameter("endereco");
			String cep = request.getParameter("cep");
			String telefone =  request.getParameter("telefone");
			String email = request.getParameter("email");
			String senha = request.getParameter("Senha");



			//Cadastro do usuário

			if(request.getParameter("cadastro").equals("cadastro")){
				UsuarioBO ub = new UsuarioBO();

				if(ub.novoUsuario(nome, sobrenome, cpf, rg, dataNasc, endereco, cep, telefone, email, senha)==true){
					request.setAttribute("nomeUser", nome);
					request.setAttribute("sobreUser", sobrenome);
					request.getRequestDispatcher("doacao.jsp").forward(request, response);
				}else{
					request.getRequestDispatcher("saidaCadastro.jsp").forward(request, response);
				}

			}else{
				request.getRequestDispatcher("SaidaNegativa.jsp").forward(request, response);

			}
		}catch (SQLException es) {

			es.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		request.getRequestDispatcher("SaidaNegativa.jsp");

	}

}

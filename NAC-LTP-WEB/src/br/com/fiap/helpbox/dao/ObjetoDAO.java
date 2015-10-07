package br.com.fiap.helpbox.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.helpbox.beans.Objeto;
import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.conexao.ConexaoFactory;
/**
 * O DAO (data acess object) é um padrão de acesso à dados, serve para 
 * desacoplar a camada de negócio. Nele também devem conter todas as 
 * informações de cada classe feita até aqui. 
 * 
 * O DAO busca os dados do Banco de Dados e converte em objetos para
 * serem usados pela aplicação. Também pega os obejtos, converte em SQL e 
 * manda para o Banco de Dados. É assim que o DAO trabalha. 
 * 
 * Temos um DAO para cada objeto feito do domínio do sistema. 
 * 
 * @author Beatriz Biserra rm74656
 * @author Hélder Alcântara rm74504
 * @author Thyago Pozzibon rm75064
 * @author Ulric Merguiço rm73619
 * 
 * @version 1.0
 * @since 1.0
 *
 */
public class ObjetoDAO {
	/**
	 * Utiilizamos a conexão para conseguirmos conectar com o Banco MySQL.
	 * O throws Exception serve para que seja lançado o possível erro para o 
	 * método.
	 */

	private Connection conexao;

	public ObjetoDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}


	/**
	 * Método para adicionar cada objeto a ser doado. Inserimos todos os atributos 
	 * da tabela Objeto e colocamos como parâmetro. 
	 * O prepared Statement permite criar os objetos utilizados para passagem de 
	 * comandos ao Banco de Dados. Usado quando a declaração SQL tiver um ou 
	 * mais parâmetros que podem ser enviados em conjunto.
	 * Cada interrogação é como um valor para ser acrescentado.
	 * @param o
	 * @return true
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	
	// CRUD (Create)
	public boolean addObjeto(Objeto o) throws SQLException, Exception{
		String sql = "INSERT INTO T_HB_OBJETO (cd_objeto, tp_objeto, ds_objeto, qt_objeto, ds_estado, ds_genero) VALUES (?,?,?,?,?,?)";
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		
		estrutura.setInt(1, o.getCodigoObjeto());
		estrutura.setString(2, o.getTipoObjeto());
		estrutura.setString(3, o.getDescricao());
		estrutura.setString(4, o.getQuantidade());
		estrutura.setString(5, o.getEstado());
		estrutura.setString(6, o.getGenero());
		
		
		estrutura.execute();
		estrutura.close();
		return true;
	}

	// CRUD (Read)
	//public Objeto pesquisarObjeto(String obj) throws Exception{
	//	Objeto objeto = new Objeto();
	//	PreparedStatement estrutura = this.conexao.prepareStatement("select * from T_HB_OBJETO WHERE");
	//	estrutura.setString(1, strObjeto);
//		ResultSet resultadoDados = estrutura.executeQuery();
//		if(resultadoDados.next()){
//			objeto.setCodigoObjeto(resultadoDados.getInt("cd_objeto"));
//			objeto.setNome(resultadoDados.getString("nm_objeto"));
//			objeto.setDescricao(resultadoDados.getString("ds_objeto"));
//			objeto.setQuantidade(resultadoDados.getInt("qt_objeto"));
//			objeto.setEstado(resultadoDados.getString("ds_estado"));
//			objeto.setCor(resultadoDados.getString("ds_cor"));
//			objeto.setGenero(resultadoDados.getString("ds_genero"));
//		}
//	//	resultadoDados.close();
////		estrutura.close();
//		return objeto;
//	}

	// CRUD (Update)
//	public int atualizarObjeto(Objeto objeto) throws Exception{
//		PreparedStatement stmt = conexao.prepareStatement("update T_HB_OBJETO set nm_objeto=?, ds_objeto=?, qt_objeto=?, ds_estado=?, ds_cor=?, ds_genero=? where cd_objeto=?");
//		stmt.setString(1,objeto.getNome() );
//		stmt.setString(2,objeto.getDescricao() );
//		stmt.setInt(3,objeto.getQuantidade() );
//		stmt.setString(4,objeto.getEstado() );
//		stmt.setString(5,objeto.getCor() );
//		stmt.setString(6,objeto.getGenero() );	
//		int saida = stmt.executeUpdate();
//		stmt.close();
//		return saida;
	//}

	/**
	 * Criamos esse método para deletar os atributos da classe Objeto referente
	 * a tebela Objeto. Passando o parâmetro para a busca no Banco.  
	 * O throws Exception serve para que seja lançado o possível erro para o 
	 * método.
	 * 
	 * @param x
	 * @return saida
	 * @throws Exception
	 */
	// CRUD (Delete)
//	public int deletarObjeto(int x) throws Exception{
//		PreparedStatement stmt = conexao.prepareStatement("delete from T_HB_OBJETO where cd_objeto=?");
//		stmt.setInt(1, x);
//		int saida = stmt.executeUpdate();
//		stmt.close();
//		return saida;
//	}

	
}

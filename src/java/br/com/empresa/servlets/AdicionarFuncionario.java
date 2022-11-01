package br.com.empresa.servlets;

import br.com.empresa.funcionario.Funcionario;
import br.com.empresa.funcionario.FuncionarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juliano Ramos
 */
@WebServlet("/Adicionar")
public class AdicionarFuncionario extends HttpServlet {

    //private static final long serialVersionUID 1L;
    
   
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response){
      String Nome = request.getParameter("nome_funcionario");
      String Setor = request.getParameter("setor_funcionario");
      String Cargo = request.getParameter("cargo_funcionario");
      String CPF = request.getParameter("cpf_funcionario");
      String Telefone = request.getParameter("telefone_funcionario");
      String Endereco = request.getParameter("endereco_funcionario");
      
      Funcionario funcionario = new Funcionario();
      funcionario.setNome(Nome);
      funcionario.setSetor(Setor);
      funcionario.setTelefone(Telefone);
      funcionario.setEndereco(Endereco);
      funcionario.setCargo(Cargo);
      funcionario.setCpf(CPF);
      
      try{
       FuncionarioDAO Dao = new FuncionarioDAO();
       Dao.cadastrar(funcionario);
       response.sendRedirect("index.jsp");
      }catch(ClassNotFoundException i){
      }
      catch(SQLException e){
      }
      catch(IOException t){
      }
      
      
      
      
    }
    

}

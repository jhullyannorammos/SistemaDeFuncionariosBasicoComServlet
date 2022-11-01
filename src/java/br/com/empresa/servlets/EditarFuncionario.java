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
@WebServlet("/Editar")
public class EditarFuncionario extends HttpServlet {
    
    public EditarFuncionario(){
    
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws NumberFormatException, NullPointerException{
        
         String Nome = request.getParameter("ed_nome_funcionario");
         String Setor = request.getParameter("ed_setor_funcionario");
         String Cargo = request.getParameter("ed_cargo_funcionario");
         String CPF = request.getParameter("ed_cpf_funcionario");
         String Telefone = request.getParameter("ed_telefone_funcionario");
         String Endereco = request.getParameter("ed_endereco_funcionario");  
         Double Renda = Double.parseDouble(request.getParameter("ed_renda_funcionario"));  
         
         try{
             
           Funcionario funcionario = new Funcionario();
           funcionario.setNome(Nome);
           funcionario.setSetor(Setor);
           funcionario.setTelefone(Telefone);
           funcionario.setEndereco(Endereco);
           funcionario.setCargo(Cargo);
           funcionario.setCpf(CPF);
           funcionario.setRenda(Renda);
           
            FuncionarioDAO Dao = new FuncionarioDAO();
            Dao.Editar(funcionario);
            response.sendRedirect("index.jsp");
            
        }catch(ClassNotFoundException i){
        }
        catch(SQLException e){
        }
        catch(IOException t){
        }
        }
    
    
    //}
    
}

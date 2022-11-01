package br.com.empresa.servlets;

import br.com.empresa.funcionario.Funcionario;
import br.com.empresa.funcionario.FuncionarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juliano Ramos
 */
@WebServlet("/Deletar")
public class DeletarFuncionario extends HttpServlet {
    
    public DeletarFuncionario(){
      
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
      if(request.getParameter("idd") != null){
        Funcionario f = new Funcionario();
        f.setId(Long.parseLong(request.getParameter("idd")));
        FuncionarioDAO Dao;
        try
        {
            Dao = new FuncionarioDAO();
            Dao.Remover(f);
            response.sendRedirect("index.jsp");
        }
        catch(SQLException e) 
        {
              
        }
        catch(ClassNotFoundException c) 
        {
              
        }
        
      }else{
        response.sendRedirect("editar.jsp");
      }
    }
        
    
}

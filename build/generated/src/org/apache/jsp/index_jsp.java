package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.JasperException;
import br.com.empresa.funcionario.Funcionario;
import br.com.empresa.funcionario.FuncionarioDAO;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Formulario de cadastro</title>\r\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function remover(id){\r\n");
      out.write("            if(window.confirm(\"Deseja apagar esse cliente?\")){\r\n");
      out.write("                window.location = 'http://localhost:8080/Funcionarios/Deletar?idd=' + id;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"main\" class=\"\" style=\"width:800px;\">\r\n");
      out.write("            <form method=\"post\" action=\"Adicionar\">\r\n");
      out.write("        <br />\r\n");
      out.write("        <label style=\"text-align:center; font-size:30px\">Cadastrar</label>\r\n");
      out.write("        <br /><br />\r\n");
      out.write("        <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("           <td>Nome completo</td>\r\n");
      out.write("           <td><input name=\"nome_funcionario\" type=\"text\" size=\"40\"/></td>\r\n");
      out.write("           <td>Cargo</td>\r\n");
      out.write("           <td><input name=\"cargo_funcionario\" type=\"text\" size=\"40\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("           <td>Endereço</td>\r\n");
      out.write("           <td><input name=\"endereco_funcionario\" type=\"text\" size=\"40\"/></td>\r\n");
      out.write("           <td>Renda</td>\r\n");
      out.write("           <td><input name=\"renda_funcionario\" type=\"number\" size=\"40\" value=\"900.0\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("           <td>Telefone</td>\r\n");
      out.write("           <td><input name=\"telefone_funcionario\" type=\"text\" size=\"40\"/></td>\r\n");
      out.write("           <td>Setor</td>\r\n");
      out.write("           <td><input name=\"setor_funcionario\" type=\"text\" size=\"40\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("           <td>CPF</td>\r\n");
      out.write("           <td><input name=\"cpf_funcionario\" type=\"text\"  size=\"40\"/></td>\r\n");
      out.write("           <td></td>\r\n");
      out.write("           <td><input name=\"salvar\" type=\"submit\" value=\"Salvar\" size=\"40\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        <br /><br />\r\n");
      out.write("        <table cellpadding=\"5px\" width=\"auto\">\r\n");
      out.write("          <tr style=\"background-color:black; color:#FFF;\">\r\n");
      out.write("           <td>Matricula</td>\r\n");
      out.write("           <td>Nome completo</td>\r\n");
      out.write("           <td>Setor</td>\r\n");
      out.write("           <td>Cargo</td>\r\n");
      out.write("           <td>Renda</td>\r\n");
      out.write("           <td>CPF</td>\r\n");
      out.write("           <td>Endereço</td>\r\n");
      out.write("           <td>Contatos</td>\r\n");
      out.write("           <td>Editar</td>\r\n");
      out.write("           <td>Remover</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("            ");

            FuncionarioDAO dao = new FuncionarioDAO();
            for(Funcionario f : dao.listar()){
            
      out.write("\r\n");
      out.write("          <tr class=\"Line\" style=\"background-color:#CCC; \">\r\n");
      out.write("           <td>");
 out.println(f.getId()); 
      out.write("</td>\r\n");
      out.write("           <td>");
 out.println(f.getNome()); 
      out.write("</td>\r\n");
      out.write("           <td>");
 out.println(f.getSetor()); 
      out.write("</td>\r\n");
      out.write("           <td>");
 out.println(f.getCargo()); 
      out.write("</td>\r\n");
      out.write("           <td>");
 out.println(f.getRenda()); 
      out.write("</td>\r\n");
      out.write("           <td>");
 out.println(f.getCpf()); 
      out.write("</td>\r\n");
      out.write("           <td>");
 out.println(f.getEndereco()); 
      out.write("</td>\r\n");
      out.write("           <td>");
 out.println(f.getTelefone()); 
      out.write("</td>\r\n");
      out.write("           <td><a href=\"editar.jsp?editar_id=");
      out.print(f.getId() );
      out.write("\" ><img class=\"btn\" src=\"Pictures/editar.png\" /></a></td>\r\n");
      out.write("           <td><a href=\"#\" onclick=\"remover('");
      out.print(f.getId() );
      out.write("');\" ><img class=\"btn\" src=\"Pictures/remover.png\" /></a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");

            }
          
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

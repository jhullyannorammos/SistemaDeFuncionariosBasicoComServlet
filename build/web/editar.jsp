<%@page import="javax.management.RuntimeErrorException"%>
<%@page import="org.apache.jasper.JasperException"%>
<%@page import="br.com.empresa.funcionario.Funcionario"%>
<%@page import="br.com.empresa.funcionario.FuncionarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Formulario de cadastro</title>
        <link href="css/css.css" rel="stylesheet" type="text/css" />
    </head>
    
    <script type="text/javascript">
        function remover(id){
            if(window.confirm("Deseja apagar esse cliente?")){
                window.location = 'http://localhost:8080/Funcionarios/Deletar?idd=' + id;
            }
        }
    </script>
    
    <style>
        /*#grid{widht: 800px; height: 200px; overflow: scroll y;}*/
    </style>
    <body>
        <%  
        int i = Integer.parseInt(request.getParameter("editar_id"));
        FuncionarioDAO DataObjectAcess = new FuncionarioDAO();
        Funcionario fc = new Funcionario();
        
        fc = DataObjectAcess.listarById(i);
        
        
        %>
        <div id="main" class="" style="width:800px;">
        <form method="post" action="Editar">
        <br />
        <label style="text-align:center; font-size:30px;">Editar</label>
        <br /><br />
        <table>
        <tr>
           <td>Nome completo</td>
           <td><input name="ed_nome_funcionario" value="<% out.println(fc.getNome()); %>" type="text" size="40"/></td>
           <td>Cargo</td>
           <td><input name="ed_cargo_funcionario" value="<% out.println(fc.getCargo()); %>" type="text" size="40"/></td>
        </tr>
        <tr>
           <td>Endereço</td>
           <td><input name="ed_endereco_funcionario" value="<% out.println(fc.getEndereco()); %>" type="text" size="40"/></td>
           <td>Renda</td>
           <td><input name="ed_renda_funcionario" type="text" value="<% out.println(fc.getRenda()); %>" size="40" value="900.0" /></td>
        </tr>
        <tr>
           <td>Telefone</td>
           <td><input name="ed_telefone_funcionario" value="<% out.println(fc.getTelefone()); %>" type="text" size="40"/></td>
           <td>Setor</td>
           <td><input name="ed_setor_funcionario" value="<% out.println(fc.getSetor()); %>" type="text" size="40"/></td>
        </tr>
        <tr>
           <td>CPF</td>
           <td><input name="ed_cpf_funcionario" value="<% out.println(fc.getCpf()); %>" type="text" disabled="true" size="40"/></td>
           <td></td>
           <td><input name="salvar" type="submit" value="Salvar alteração" size="40"/></td>
        </tr>
        </table>
        </form>
        

        
        <br /><br />
        <table cellpadding="5px"; width="auto";>
          <tr style="background-color:black; color:#FFF;">
           <td>Matricula</td>
           <td>Nome completo</td>
           <td>Setor</td>
           <td>Cargo</td>
           <td>Renda</td>
           <td>CPF</td>
           <td>Endereço</td>
           <td>Contatos</td>
           <td>Editar</td>
           <td>Remover</td>
          </tr>
            <%
            FuncionarioDAO dao = new FuncionarioDAO();
            for(Funcionario f : dao.listar()){
            %>
          <tr class="Line" style="background-color:#CCC; ">
           <td><% out.println(f.getId());       %></td>
           <td><% out.println(f.getNome());     %></td>
           <td><% out.println(f.getSetor());    %></td>
           <td><% out.println(f.getCargo());    %></td>
           <td><% out.println(f.getRenda());    %></td>
           <td><% out.println(f.getCpf());      %></td>
           <td><% out.println(f.getEndereco()); %></td>
           <td><% out.println(f.getTelefone()); %></td>
           <td><a href="editar.jsp?editar_id=<%=f.getId() %>" ><img class="btn" src="Pictures/editar.png" /></a></td>
           <td><a href="#" onclick="remover('<%=f.getId() %>');" ><img class="btn" src="Pictures/remover.png" /></a></td>
          </tr>
          <%
            }
          %>
        </table>
        <a href="index.jsp">Voltar para a pagina de cadastro</a>
        </div>
        
    </body>
</html>

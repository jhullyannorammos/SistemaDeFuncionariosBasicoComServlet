<%@page import="org.apache.jasper.JasperException"%>
<%@page import="br.com.empresa.funcionario.Funcionario"%>
<%@page import="br.com.empresa.funcionario.FuncionarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    
   
    <body>

        <div id="main" class="" style="width:800px;">
            <form method="post" action="Adicionar">
        <br />
        <label style="text-align:center; font-size:30px">Cadastrar</label>
        <br /><br />
        <table>
        <tr>
           <td>Nome completo</td>
           <td><input name="nome_funcionario" type="text" size="40"/></td>
           <td>Cargo</td>
           <td><input name="cargo_funcionario" type="text" size="40"/></td>
        </tr>
        <tr>
           <td>Endereço</td>
           <td><input name="endereco_funcionario" type="text" size="40"/></td>
           <td>Renda</td>
           <td><input name="renda_funcionario" type="number" size="40" value="900.0" /></td>
        </tr>
        <tr>
           <td>Telefone</td>
           <td><input name="telefone_funcionario" type="text" size="40"/></td>
           <td>Setor</td>
           <td><input name="setor_funcionario" type="text" size="40"/></td>
        </tr>
        <tr>
           <td>CPF</td>
           <td><input name="cpf_funcionario" type="text"  size="40"/></td>
           <td></td>
           <td><input name="salvar" type="submit" value="Salvar" size="40"/></td>
        </tr>
        </table>
        </form>
        
        <br /><br />
        <table cellpadding="5px" width="auto">
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
           <td><% out.println(f.getId()); %></td>
           <td><% out.println(f.getNome()); %></td>
           <td><% out.println(f.getSetor()); %></td>
           <td><% out.println(f.getCargo()); %></td>
           <td><% out.println(f.getRenda()); %></td>
           <td><% out.println(f.getCpf()); %></td>
           <td><% out.println(f.getEndereco()); %></td>
           <td><% out.println(f.getTelefone()); %></td>
           <td><a href="editar.jsp?editar_id=<%=f.getId() %>" ><img class="btn" src="Pictures/editar.png" /></a></td>
           <td><a href="#" onclick="remover('<%=f.getId() %>');" ><img class="btn" src="Pictures/remover.png" /></a></td>
          </tr>
          <%
            }
          %>
        </table>
        </div>
        
    </body>
</html>

package br.com.empresa.funcionario;

import br.com.empresa.conexao.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.jasper.JasperException;

/**
 *
 * @author Juliano Ramos
 */
public class FuncionarioDAO {
    private Connection conexao;
    
    public FuncionarioDAO() throws ClassNotFoundException, SQLException{
      this.conexao = ConectionFactory.conectar();
      
    }
    
    public void Remover(Funcionario funcionario) throws SQLException{
      
      String SQL = "delete from funcionarios where id = ?";
      
      PreparedStatement ps = conexao.prepareStatement(SQL);
      
      ps.setLong(1, funcionario.getId());
      ps.execute();
      ConectionFactory.desconectar(conexao, ps);
    }
    
    public void Editar(Funcionario funcionario){
      String SQL = "update funcionarios set nome = ?, setor = ?, cargo = ?, renda = ?, telefone = ?, endereco = ? where id = ?";
      
      try{
        PreparedStatement ps = conexao.prepareStatement(SQL);
        ps.setString(1, funcionario.getNome());
        ps.setString(2, funcionario.getSetor());
        ps.setString(3, funcionario.getCargo());
        ps.setDouble(4, funcionario.getRenda());
        ps.setString(5, funcionario.getTelefone());
        ps.setString(6, funcionario.getEndereco());
        ps.setString(7, funcionario.getCpf());
        ps.execute();
        
        ConectionFactory.desconectar(conexao, ps);
      }
      catch(SQLException i){
          throw new RuntimeException(i);
      }
    
    }
    
    
  
    public Funcionario listarById(int i) throws SQLException, ClassNotFoundException {
      
       Funcionario fc = new Funcionario();
       FuncionarioDAO dao = new FuncionarioDAO();
       ArrayList<Funcionario> funcionarios = new ArrayList<>();
       
       funcionarios = dao.listar();
       System.out.println(i);
       try{
         int tamanho = funcionarios.size();
         
         while(tamanho >= 0){
        
          fc = funcionarios.get(tamanho - 1);
       
          if(fc.getId() == i){
           return fc;
          }else{
           tamanho--;
          }
         }
       
       }catch(IndexOutOfBoundsException o){
           throw new RuntimeException(o);
       }
       
       return fc;
       
    }
    
    
    public ArrayList<Funcionario> listar() throws SQLException{
      ArrayList<Funcionario> funcionarios = new ArrayList<>();
      String SQL = "select * from funcionarios";
      PreparedStatement ps = conexao.prepareStatement(SQL);
      ResultSet rs = ps.executeQuery();
      
      while(rs.next()){
          
          Funcionario f = new Funcionario();
          
          f.setNome(rs.getString("nome"));
          f.setCpf(rs.getString("cpf"));
          f.setCargo(rs.getString("cargo"));
          f.setSetor(rs.getString("setor"));
          f.setEndereco(rs.getString("endereco"));
          f.setTelefone(rs.getString("telefone"));
          f.setRenda(rs.getDouble("renda"));
          f.setId(rs.getInt("id"));
          
          funcionarios.add(f);
      }
      ConectionFactory.desconectar(conexao, ps, rs);
      return funcionarios;
      
    }
    
    public void cadastrar(Funcionario funcionario){
      String SQL = "insert into funcionarios(id, nome, endereco, telefone, cpf, renda, cargo, setor) values(?,?,?,?,?,?,?,?)";

      try{
        PreparedStatement ps = conexao.prepareStatement(SQL);
      
        ps.setLong(1, funcionario.getId());
        ps.setString(2, funcionario.getNome());
        ps.setString(3, funcionario.getEndereco());
        ps.setString(4, funcionario.getTelefone());
        ps.setString(5, funcionario.getCpf());
        ps.setDouble(6, funcionario.getRenda());
        ps.setString(7, funcionario.getCargo());
        ps.setString(8, funcionario.getSetor());
        
        ps.execute();
        
        ConectionFactory.desconectar(conexao, ps);
      }
      catch(SQLException i){ 
        throw new RuntimeException(i);
      }
      
    }
    
    
    public static void main(String Args[]) throws ClassNotFoundException, SQLException{

    }
}

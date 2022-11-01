package br.com.empresa.funcionario;
/**
 *
 * @author Juliano Ramos
 */
public class Funcionario {
    private long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private double renda;
    private String cargo;
    private String setor;
    
    public Funcionario(){
        this.setRenda(900.0);
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the renda
     */
    public double getRenda() {
        return renda;
    }

    /**
     * @param renda the renda to set
     */
    public void setRenda(double renda) {
        this.renda = renda;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}

/*

CREATE TABLE  `empresa`.`Funcionarios` (
`id` INT( 11 ) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
`nome` VARCHAR( 99 ) NOT NULL ,
`endereco` VARCHAR( 99 ) NOT NULL ,
`telefone` VARCHAR( 99 ) NOT NULL ,
`cpf` VARCHAR( 11 ) NOT NULL ,
`renda` DOUBLE NOT NULL ,
`cargo` VARCHAR( 99 ) NOT NULL ,
`setor` VARCHAR( 99 ) NOT NULL ,
UNIQUE (
`cpf`
)
) ENGINE = INNODB;


*/

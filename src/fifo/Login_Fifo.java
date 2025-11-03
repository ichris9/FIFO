package fifo;

import java.util.Scanner;

public class Login_Fifo {
    
    private String nomeUsuário = "";
    private String NomeEmpresa;
    private String cnpj;
    private String nomeFantasia;
    private String email;
    private String senha;
    private String tipoDeEmpresa;
    private String endereço;
    private String telefone;
    
    Scanner ler = new Scanner(System.in);

    public Login_Fifo(String NomeEmpresa, String cnpj, String nomeFantasia, String email, String senha, String tipoDeEmpresa, String endereço, String telefone) {
        this.NomeEmpresa = NomeEmpresa;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.senha = senha;
        this.tipoDeEmpresa = tipoDeEmpresa;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    
    
    
    public String getNomeUsuário() {
        return nomeUsuário;
    }

    public void setNomeUsuário(String nomeUsuário) {
        this.nomeUsuário = nomeUsuário;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoDeEmpresa() {
        return tipoDeEmpresa;
    }

    public void setTipoDeEmpresa(String tipoDeEmpresa) {
        this.tipoDeEmpresa = tipoDeEmpresa;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

       public void cadastro(){
           
       }
    
    
}

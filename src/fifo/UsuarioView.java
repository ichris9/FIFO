package fifo;

import java.util.Scanner;

public class UsuarioView {
    
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

    public UsuarioView(String nomeUsuario, String NomeEmpresa, String cnpj, String nomeFantasia, String email, String senha, String tipoDeEmpresa, String endereço, String telefone) {
        this.nomeUsuário = nomeUsuario;
        this.NomeEmpresa =NomeEmpresa;
        this.cnpj = cnpj;
        this.nomeFantasia =nomeFantasia;
        this.email = email;
        this.senha = senha;
        this.tipoDeEmpresa = tipoDeEmpresa;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public UsuarioView() {
        //
    }

    public UsuarioView(String NomeEmpresa, String senha) {
        this.NomeEmpresa = NomeEmpresa;
        this.senha = senha;
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
           System.out.println(">>>CADASTRO DE USUÁRIO<<<");
           System.out.println("Crie um nome de usuário:");
           String cadastroNomeUsuario = ler.nextLine();
           
           System.out.println("Digite o nome júridico da sua empresa:");
           String cadastroNomeEmpresa = ler.nextLine();
           
           System.out.println("Digite seu CNPJ:");
           String cadastroCNPJ = ler.nextLine();
           
           System.out.println("Qual o nome fantasia da empresa?");
           String cadastroNomeFantasia = ler.nextLine();
           
           System.out.println("Digite o seu email: ");
           String cadastroEmail = ler.nextLine();
           
           System.out.println("Crie uma senha:");
           String cadastroSenha = ler.nextLine();
           
           System.out.println("Qual o ramo da empresa?");
           String cadastroTipoEmpresa = ler.nextLine();
           
           System.out.println("digite seu endereco");
           String cadastroEndereco = ler.nextLine();
           
           System.out.println("Digite seu telefone:");
           String cadastroTelefone = ler.nextLine();
           UsuarioDAO a = new UsuarioDAO();
           a.insert(cadastroNomeUsuario, cadastroNomeEmpresa, cadastroCNPJ, cadastroNomeFantasia, cadastroEmail, cadastroSenha, cadastroTipoEmpresa, cadastroEndereco, cadastroTelefone);
       } 
       
       public void AtualizarDados(){
           System.out.println(">>>ATUALIZAÇÃO DE DADOS<<<");
           System.out.println("quando se altera o email voce tmabém precisa alterar a senha, caso não queira, digite a mesma.");
           System.out.println("----------------------------------------");
           System.out.println("Novo Email: ");
           String updateEmail = ler.nextLine();
           System.out.println("Nova Senha: ");
           String updateSenha = ler.nextLine();
           System.out.println("Digite o cnpj referente a conto que deseja fazer a alteracao:");
           String cnpjParaUpdate = ler.nextLine();
           
            UsuarioDAO a = new UsuarioDAO();
           a.update(updateEmail, updateSenha, cnpjParaUpdate);
       }
       
       public void apagarConta(){
           System.out.println("VOCE TEM CERTEZA QUE VAI DELETAR SUA CONTA? (sim|não)");
           String resp = ler.next();
           resp = resp.toLowerCase();
           
           if(resp.equals("sim")){
               System.out.println("Digite o CNPJ:");
               String deleteCNPJ = ler.nextLine();
               UsuarioDAO a = new UsuarioDAO();
               a.delete(deleteCNPJ);
           }else{
               System.out.println("apagar conta não executado!");
           }
       }
       
       public void LogarContaExistente(){
           UsuarioDAO a = new UsuarioDAO();
           System.out.println(">>>LOGIN<<<");
           
           System.out.println("Digite o nome de usuário:");
           String NomeLogin = ler.nextLine();
           System.out.println("Digite sua senha: ");
           String SenhaLogin = ler.nextLine();
           
           UsuarioView dadosBanco = new UsuarioView(NomeLogin, SenhaLogin);
           if(dadosBanco != null){
               UsuarioView usuarioEncontrado = new UsuarioView();
                usuarioEncontrado.setNomeUsuário(dadosBanco.getNomeUsuário());
                usuarioEncontrado.setSenha(dadosBanco.getSenha());
                usuarioEncontrado.setNomeEmpresa(dadosBanco.getNomeEmpresa());
                usuarioEncontrado.setCnpj(dadosBanco.getCnpj());
                usuarioEncontrado.setNomeFantasia(dadosBanco.getNomeFantasia());
                usuarioEncontrado.setEmail(dadosBanco.getEmail());
                usuarioEncontrado.setTipoDeEmpresa(dadosBanco.getTipoDeEmpresa());
                usuarioEncontrado.setEndereço(dadosBanco.getEndereço());
                usuarioEncontrado.setTelefone(dadosBanco.getTelefone());
                System.out.println("================================");
                System.out.println(">>>USUARIO: " +this.getNomeUsuário()+" ESTA LOGO<<<");
                
           }else{
               System.out.println(">>>LOGIN FALHOU, USUARIO NÃO POSSUI CONTA<<<");
           }
           
           a.verificarLogin(nomeUsuário, senha);
       }
    
    
}

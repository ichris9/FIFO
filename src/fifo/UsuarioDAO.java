package fifo;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UsuarioDAO {
    String conexaoJDBC ="jdbc:sqlserver://Christian\\sqlexpress;databaseName=DBFiFo;IntegratedSecurity=true;encrypt=true;TrustServerCertificate=true;";
    
    public UsuarioDAO(){
       System.out.println("classe usuário criada: "+ conexaoJDBC);
    }
    
    //verifica se existe o login
    public void verificarLogin(String nomeUsuario, String senha){
        String sql = "SELECT * FROM Usuario WHERE nome_User =? AND senha = ?";
        
        try(Connection cone = DriverManager.getConnection(conexaoJDBC);
              PreparedStatement ps = cone.prepareStatement(sql)){
            ps.setString(1,nomeUsuario);
            ps.setString(2, senha);
            int linhas = ps.executeUpdate();
            if(linhas >0){
                System.out.println("verificação concluida: " + linhas);
            }
            
        }catch(SQLException e){
            System.out.println("Erro de conexão usuárioDAO, favor verificar: verification error");
        }
    }
    
    
    //Cadastro do usuário
    public void insert(String nomeUsuario, String empresa, String cnpj, String nomeFantasia,String email,String senha,String TipoEmpresa, String endereco, String telefone){
         String sql = "INSERT INTO Usuario (nome_User,empresa,cnpj,nome_Fantasia,email,senha,tipo_empresa,endereco,telefone,)VALUES(?,?,?,?,?,?,?,?,?)";
         
         try(Connection cone = DriverManager.getConnection(conexaoJDBC);
                 PreparedStatement ps = cone.prepareStatement(sql)){
             ps.setString(1, nomeUsuario);
             ps.setString(2, empresa);
             ps.setString(3, cnpj);
             ps.setString(4, nomeFantasia);
             ps.setString(5, email);
             ps.setString(6, senha);
             ps.setString(7, TipoEmpresa);
             ps.setString(8, endereco);
             ps.setString(9, telefone);
             
             int linhas = ps.executeUpdate();
             if(linhas >0){
                 System.out.println("cadastro concluido com sucesso! " + linhas+" Linhas");
             }
             
         }catch(SQLException e){
             System.out.println("Erro de conexão usuárioDAO, favor verificar: insert error");
         }
    }                 
    
    
    public void update(){
        
    }
    
    public void delete(String cnpj){
        String sql = "DELETE FROM Usuario where cnpj=?";
        
        try(Connection cone = DriverManager.getConnection(conexaoJDBC);
             PreparedStatement ps = cone.prepareStatement(sql)){
            ps.setString(1,cnpj);
        }catch(SQLException e){
            System.out.println("Erro de conexão usuárioDAO, favor verificar: insert error");
        }
    }
}

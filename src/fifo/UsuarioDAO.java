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
            
        }catch(SQLException e){
            System.out.println("Erro de conexão usuárioDAO, favor verificar");
        }
    }
    
    //Cadastro do usuário
    public void insert(){
         String sql = "INSERT INTO Usuario nome_User =? AND empresa = ? AND cnpj = ? AND nome_Fantasia = ? AND email = ? AND senha = ? AND tipo_empresa =? AND endereco =? AND telefone =? ";
    }                  //corrigir sintax
    
    
    public void update(){
        
    }
    
    public void delete(){
        
    }
}

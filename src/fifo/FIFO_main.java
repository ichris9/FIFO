package fifo;

import java.util.Scanner;

public class FIFO_main {
    public static void main(String[] args) {
        UsuarioView user = new UsuarioView();
        Scanner ler = new Scanner(System.in);
        //INTRODUÇÃO
        System.out.println("+-----+-----+-----+-----+");
        System.out.println("|  F  |  I  |  F  |  O  |");
        System.out.println("+-----+-----+-----+-----+");
        
        System.out.println("[1]Login"
                +"\n[2]Cadastrar"
                +"\n[3]Atualizar Email"
                +"\n[4]Apagar conta");
        int opt = ler.nextInt();
        
        switch(opt){
            case 1 -> user.LogarContaExistente();
            case 2 -> user.cadastro();
            case 3 -> user.AtualizarDados();
            case 4 -> user.apagarConta();
        }
        
    }
    
}

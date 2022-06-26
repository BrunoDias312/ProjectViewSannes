package Menu;
import Pacote_NotasAlunos.Array;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private String nomeUser; // Nome de user
    private int escolhaUser; //Escolha do user para saber qual program ira rodar

    public String Inicio(String nome){
        System.out.println("-----------------------------------");
        System.out.println("De entrada em seu nome: ");
        Scanner entrada = new Scanner(System.in);
        nome = entrada.nextLine();
        this.nomeUser = nome;
        return nome;
    }

    public static void LimparConsole() throws IOException, InterruptedException{
        //Limpar console


//        if(System.getProperty("os.name").contains("Windows")){
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//            Runtime.getRuntime().exec("cmd /c cls");
//        }
        try{
            final String os = System.getProperty("os.name");

            if(os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }
            else
                Runtime.getRuntime().exec("clear");
        }
        catch(final Exception e){
            //Handle any execptions.
        }

    }

    public Menu() throws IOException, InterruptedException{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Faça sua escolha de acordo com o que deseja rodar");
        System.out.println("Escolha: ");
        System.out.println("    1 - Notas para alunos");
        System.out.print("Entrada: ");
        int escolhaUser = entrada.nextInt();

        switch (escolhaUser){
            case 1:

                LimparConsole();
                System.out.println("Sua escolha é " + "1 - notas para alunos.");
                Array array = new Array();
                break;
            default:
                System.out.println("Opcão invalida.");
        }

    }
}

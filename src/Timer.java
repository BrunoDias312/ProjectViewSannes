import java.util.Scanner;

public class Timer {

    public Timer(){
        System.out.println("Horario de entrada: ");
        Scanner entrada = new Scanner(System.in);
        //entrada user
        int tempoEntrada1 = entrada.nextInt();//entrada hora
        int tempoEntrada2 = entrada.nextInt();//entrada minutos
        int tempoEntrada3 = entrada.nextInt();//entrada segundos

        int entradaHora = tempoEntrada1 * 3600; //converter para segundos
        int entradaMinutos = tempoEntrada2 * 60; //converter para segundos
        int entradaFinal = entradaHora + entradaMinutos;

        //Tempo decorrido
        System.out.println("Tempo decorrido(em segundos): ");
        int tempoDecorrido = entrada.nextInt();

        int minutosR = entradaFinal + tempoDecorrido; // somar todos
        System.out.println(minutosR);

        //H - M - S;

        int segundos = minutosR;
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        System.out.print("Tempo passado: ");
        if (horas > 0)
            System.out.print(horas + ":");
        if (minutos > 0)
            System.out.print(minutos + ":");
        if (segundos > 0)
            System.out.println(segundos);
        if(segundos == 0){
            System.out.print("00");
        }
    }
}

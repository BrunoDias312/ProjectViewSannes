package Pacote_NotasAlunos;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public Array(){
        Scanner entrada = new Scanner(System.in);
        EntradaNotas entradaNotas = new EntradaNotas();
        double[][] notaDaTurma = new double[entradaNotas.quantidadeAlunos][entradaNotas.quantidadeNotas];

        double TotalNotas = 0;
        for(int alunos = 0; alunos < notaDaTurma.length; alunos++)
            for (int notas = 0; notas < notaDaTurma[alunos].length; notas++){
                System.out.printf("Nota %d do aluno %d: ", notas + 1, alunos + 1);
                notaDaTurma[alunos][notas] = entrada.nextDouble();
                TotalNotas += notaDaTurma[alunos][notas];
            }

        double mediaTurma = TotalNotas / (entradaNotas.quantidadeAlunos * entradaNotas.quantidadeNotas);

        System.out.println("O total das notas de todos os alunos é " + TotalNotas);
        System.out.printf("A media de notas é %.2f.\n", mediaTurma);

        for(double[] notaDosTurma : notaDaTurma){
            System.out.println(Arrays.toString(notaDosTurma));
        }
        entrada.close();
        entradaNotas.Mostrar();//para teste - aluno x nota
    }

}
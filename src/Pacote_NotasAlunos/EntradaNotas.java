package Pacote_NotasAlunos;

import java.util.Scanner;
public class EntradaNotas {
    int quantidadeAlunos;
    int quantidadeNotas;

    public EntradaNotas() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        quantidadeAlunos = entrada.nextInt();

        System.out.print("Quantidade de notas por alunos: ");
        quantidadeNotas = entrada.nextInt();

        NotasAlunos alunos = new NotasAlunos(quantidadeAlunos, quantidadeNotas);

    }

    public void Mostrar() {//testar codigo
        System.out.println(this.quantidadeAlunos + " e " + this.quantidadeNotas);
    }
}
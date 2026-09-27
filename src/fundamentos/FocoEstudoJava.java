package fundamentos;

import java.util.Scanner;

/**
 * Sistema de acompanhamento pessoal: "100 dias até meu primeiro trampo como Dev"
 * A cada dia que o usuário confirma ter estudado Java, o contador regressivo diminui.
 * O programa continua rodando até os 100 dias serem completados.
 */

public class FocoEstudoJava {

    static void main() {

        Scanner sc = new Scanner(System.in);

        // Contador regressivo: começa em 100 e vai diminuindo a cada dia estudado
        int diasAteMeuPrimeiroTrampoComDev = 100;

        // O loop continua enquanto ainda restarem dias no desafio
        while (diasAteMeuPrimeiroTrampoComDev > 0) {
            System.out.println("Você estudou Java hoje? (sim/não): ");

            // Variável local: só existe dentro desta rodada do loop,
            // já que cada resposta é independente das anteriores
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                // Estudou: decrementa o contador e informa quantos dias restam

                diasAteMeuPrimeiroTrampoComDev--;
                System.out.println("Faltam " + diasAteMeuPrimeiroTrampoComDev + " dias.");

            }else {
                // Não estudou: incentivo, sem alterar o contador
                System.out.println("Bora estudar! O contador não desce sem esforço. ");
            }
        }

        // Executado apenas quando o contador chega a 0 (desafio completo)
        System.out.println("Parabéns! Você completou os 100 dias!");

    }
}

package Eleicao;

import java.util.Scanner;

public class Voto {

    int vereador1 = 4433;
    int vereador2 = 6082;
    int vereador3 = 4847;
    int vereador4 = 9100;
    int vereador5 = 5657;

    int candidatoPrefeito1 = 30;
    int candidatoPrefeito2 = 40;
    int candidatoPrefeito3 = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Votação para vereador
        System.out.println("Digite o número do seu candidato a vereador: ");
        int votoVereador = scanner.nextInt();
        
        switch (votoVereador) {
            case 4433:
                System.out.println("Você votou no vereador 4433.");
                break;
            case 6082:
                System.out.println("Você votou no vereador 6082.");
                break;
            case 4847:
                System.out.println("Você votou no vereador 4847.");
                break;
            case 9100:
                System.out.println("Você votou no vereador 9100.");
                break;
            case 5657:
                System.out.println("Você votou no vereador 5657.");
                break;
            default:
                System.out.println("Número de vereador inválido.");
                break;
        }

        // Confirmação do voto para vereador
        System.out.println("Pressione Enter para confirmar, Tab para corrigir ou Shift para votar em branco:");
        scanner.nextLine(); 
        String acao = scanner.nextLine();

        if (acao.equalsIgnoreCase("Enter")) {
            System.out.println("Voto confirmado.");
        } else if (acao.equalsIgnoreCase("Tab")) {
            System.out.println("Corrija seu voto.");
        } else if (acao.equalsIgnoreCase("Shift")) {
            System.out.println("Voto em branco registrado.");
        } else {
            System.out.println("Ação inválida.");
        }

        // Votação para prefeito
        System.out.println("Digite o número do seu candidato a prefeito: ");
        int votoPrefeito = scanner.nextInt();
        
        switch (votoPrefeito) {
            case 30:
                System.out.println("Você votou no candidato a prefeito 30.");
                break;
            case 40:
                System.out.println("Você votou no candidato a prefeito 40.");
                break;
            case 50:
                System.out.println("Você votou no candidato a prefeito 50.");
                break;
            default:
                System.out.println("Número de candidato a prefeito inválido.");
                break;
        }

        // Confirmação do voto para prefeito
        System.out.println("Pressione Enter para confirmar, Tab para corrigir ou Shift para votar em branco:");
        scanner.nextLine(); 
        acao = scanner.nextLine();

        if (acao.equalsIgnoreCase("Enter")) {
            System.out.println("Voto confirmado.");
        } else if (acao.equalsIgnoreCase("Tab")) {
            System.out.println("Corrija seu voto.");
        } else if (acao.equalsIgnoreCase("Shift")) {
            System.out.println("Voto em branco registrado.");
        } else {
            System.out.println("Ação inválida.");
        }

        scanner.close();
    }
}

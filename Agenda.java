import java.util.Scanner;

public class Agenda {
  String login_email_ou_celular;
  String login_senha;
  int dia;
  int mes;
  float horario;

  public static final int ANO_ATUAL = 2025;
  public static final float QUANTIDADE_DE_HORAS_EM_UM_DIA = 24;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu email ou número de celular:");
    String login_email_ou_celular = scanner.nextLine(); 

    System.out.println("Digite sua senha:");
    String login_senha = scanner.nextLine(); 

    try {
      Thread.sleep(5000); // Pausa de 5 segundos
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Bem-vindo ao Agendamentos Online.");
    System.out.println("Faça seu agendamento agora:");

    System.out.println("Escolha o mês:");
    int mes = scanner.nextInt();
    if (mes < 1 || mes > 12) {
      System.out.println("Mês escolhido é inválido.");
      return;
    }

    System.out.println("Escolha o dia:");
    int dia = scanner.nextInt();
    if (dia < 1 || dia > diasNoMes(mes)) {
      System.out.println("Dia inválido para o mês escolhido.");
      return;
    }

    System.out.println("Escolha seu horário:");
    float horario = scanner.nextFloat(); 

    if ((horario < 8.0f) || (horario >= 12.0f && horario < 14.0f) || (horario > 19.0f)) {
      System.out.println("Horário inválido");
      return;
    }

    System.out.println("Agendamento marcado para o dia " + dia + "/" + mes + "/" + ANO_ATUAL + " às " + horario + "h realizado com sucesso!");

  }

  // Método auxiliar para calcular dias do mês
  private static int diasNoMes(int mes) {
    switch (mes) {
      case 2: return 28;
      case 4: case 6: case 9: case 11: return 30;
      default: return 31;

      scanner.close();
    }
  }
}
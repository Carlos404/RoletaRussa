import java.util.ArrayList;
import java.util.Scanner;

public class RoletaRussa {
	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);

		// Quantidade de jogadores
		System.out.println("Quantidade de jogadores");
		int qtdJogadores = Integer.parseInt(scanner.nextLine());
		System.out.println("------------------------------------------------------");

		// Nome dos Jogadores
		ArrayList<String> jogadores = new ArrayList<String>();
		System.out.println("Digite o nome dos Jogadores");
		for (int q = 1; q <= qtdJogadores;) {
			System.out.println("Jogador: " + q);
			String nomeJogadores = scanner.nextLine();
			jogadores.add(nomeJogadores);
			q++;
		}
		System.out.println("------------------------------------------------------");

		// Quantidade de tiros
		System.out.println("Quantidade de tentativas");
		int qtdTiros = Integer.parseInt(scanner.nextLine());
		if(qtdTiros <= 0) {
			System.out.println("Quantidade de tentativas deve ser superior a 0");
		}
		else {
			System.out.println("------------------------------------------------------");
		}
		
		int random = (int) (Math.random() * qtdTiros + 1);
		int numero = 0;
		for (int i = 1; i <= qtdTiros;) {

			System.out.println(jogadores.get(numero) + " Digite atirar para jogar");
			String atirar = scanner.nextLine().toLowerCase();
			if (i != random && atirar.equals("atirar")) {
				System.out.println("Essa foi por pouco");
				i++;
				numero++;
				if (numero >= qtdJogadores) {
					numero = 0;
				}
			} else if (atirar != "atirar" && random != i) {
				System.out.println("Você precisa digitar ATIRAR");
			} else if (i == random) {
				System.out.println(jogadores.get(numero) + " Morreu");
				break;
			}
		}
		scanner.close();
	}
}
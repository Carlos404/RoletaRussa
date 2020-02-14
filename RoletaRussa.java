import java.util.Scanner;

public class RoletaRussa {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int tiros = 6;

		int random = (int) (Math.random() * 6 + 1);

		for (int i = 1; i <= tiros;) {
			System.out.println("Digite atirar para jogar");
			String atirar = scanner.nextLine().toLowerCase();

			if (i != random && atirar.equals("atirar")) {
				System.out.println("Essa foi por pouco");
				i++;
			} else if (atirar != "atirar" && random != i) {
				System.out.println("Você precisa digitar ATIRAR");
			} else if (i == random) {
				System.out.println("Você morreu");
				break;
			}
		}

		scanner.close();
	}
}
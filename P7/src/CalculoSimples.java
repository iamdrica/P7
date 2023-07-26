import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
		 o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
		 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner insere = new Scanner(System.in);
	      
	       int codP1 = insere.nextInt();
	       int qtdPecas1 = insere.nextInt();
	       double valorP1 = insere.nextDouble();
	       
	       int codP2 = insere.nextInt();
	       int qtdPecas2 = insere.nextInt();
	       double valorP2 = insere.nextDouble();
	       
	       double valorFinal;
	       valorFinal = ((qtdPecas1 * valorP1) + (qtdPecas2 * valorP2));
	       
	       System.out.printf("VALOR A PAGAR: R$ "+"%.2f%n",valorFinal);

	}

}

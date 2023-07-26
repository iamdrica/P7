import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		/* Leia um valor inteiro correspondente à idade de uma pessoa em dias e 
		 informe-a em anos, meses e dias
		 Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias 
		 e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que
		 permite 12 meses e alguns dias, como 360, 363 ou 364.
		 */
		
		Scanner insere = new Scanner(System.in);
	    
	    int idade = insere.nextInt();
	    
	    int ano = idade/365;
	    int mes = idade%365;
	    int dia = mes%30;
	    
	    //conta do mes para saber os dias
	    mes = mes/30;
	    
	    System.out.println(ano+" ano(s)");
	    System.out.println(mes+" mes(es)");
	    System.out.println(dia+" dia(s)");
	}

}

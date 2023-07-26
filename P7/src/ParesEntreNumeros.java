import java.util.Scanner;

public class ParesEntreNumeros {

	public static void main(String[] args) {
		/*Faça um programa que leia 5 valores inteiros. 
		 Conte quantos destes valores digitados são pares 
		 e mostre esta informação.
		 */

		Scanner insere = new Scanner(System.in);
        int n;
	    int entradaNumero;
	    int contador=0;
	    
	    for (n=1;n<=5;n++){
	        entradaNumero = insere.nextInt();
	        
	        //se o resto da divisao por 2 = 0, eh par;
	        
	        if(entradaNumero%2==0){ 
	            contador++;
	            
	        }
	    }
	    
	    System.out.printf("%d valores pares%n",contador);
	}

}

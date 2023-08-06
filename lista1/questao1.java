package lista1;
import java.util.*;


public class questao1 {
    public static void main(String[] args) {
        /*1 - Solicite ao usu ́ario que digite um valor inteiro, um valor real e um caracter. Imprima os
valores na tela.*/ 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um valor inteiro:");
	int num1 = sc.nextInt();
	
	System.out.println(num1);
	
	
    System.out.println("Digite um valor real: ");
	float numF = sc.nextFloat();
	System.out.println(numF);
	
	System.out.println("Digite um caractere: ");
	char c;
	c = sc.next().charAt(0);
	
	System.out.println(c);
	
	
	sc.close();
    }
}

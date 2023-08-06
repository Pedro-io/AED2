package lista1;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		
		/*2 - Leia dois n ́umeros. Se um deles for maior que 65, realize a multiplica ̧c ̃ao dos mesmos. Caso
contr ́ario, se os dois forem maior que 30, realize a subtra ̧c ̃ao do maior pelo menor, senao, se um deles
for menor do que 15 e o outro diferente de 0 realize a divis ̃ao do primeiro pelo segundo. Finalmente,
se nenhum dos casos solicitados for v ́alido, mostre seu nome na tela.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		float num1 = sc.nextFloat();
		
		System.out.println("Digite outro numero:");
		float num2 = sc.nextFloat();
	
		if (num1>65 || num2 > 65)
			{
			float mult = num1 * num2; 
			System.out.println(mult);
			}
		if (((num1 < 15) ^ (num1!=0)) && ((num2 < 15) ^ (num2 !=0)))
			
		{
			if (num1 != num2)
			{
			float div = num1/num2;
			System.out.println(div);
			}
		}
		
		else 
		{
			String nome = "Pedro";
			System.out.println(nome);
		}
		
		
		sc.close();
	}

}

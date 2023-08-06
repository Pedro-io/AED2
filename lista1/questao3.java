package lista1;
import java.util.Random;

public class questao3 {
	public static void main(String[] args) {
		/*3 - Leia 10 n ́umeros inteiros em um vetor, selecione o maior e imprima o valor na tela.*/
		Random random = new Random(); 
		int[] v = new int[10];
		int maior= 0 ; 
		int aux = 0;
		 for(int i=0;i<v.length;i++)
	       {    v[i] = random.nextInt(50);
          
           
           for (int k = 0; k < v.length; k++)
           {
               for (int j = 0; j < v.length; j++)
               {
                   if (v[k] < v[j])
                   {
  
                       aux = v[k];
                       v[k] = v[j];
                       v[j] = aux;
                   }
               }
           }
	         
	      }  
		 for(int i=0;i<v.length;i++) 
		 {
			 if (i == 0 )
			 {
				 v[i] = maior; 
			 }
			 
			 if (i > maior)
			 {
				 maior = v[i];
			 }
		 }
		 
		 System.out.println("O maior numero neste vetor eh "+ maior);
		 
		}
	}
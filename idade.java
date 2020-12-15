import java.util.Scanner;
public class idades {

	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
	
	int i, idade, faixa1, faixa2, faixa3, faixa4, faixa5;
	double porcent, porcent2, porcent3, porcent4, porcent5;
	
	faixa1 = 0;
	faixa2 = 0;
	faixa3 = 0;
	faixa4 = 0;
	faixa5 = 0;
	
	
	for (i=1; i<=15; i++) {	
	
	System.out.println("Escreva a idade");
		idade = ler.nextInt();
			
			if(idade<=15) {
				faixa1++;
			}else if (idade<=30) {
				faixa2++;
			}else if (idade<=45) {
				faixa3++;
			}else if (idade<=60) {
				faixa4++;
			}else {
				faixa5++;
			}

		}
			System.out.println("pessoas na 1º Faixa etária: "+ faixa1);
			System.out.println("pessoas na 2º Faixa etária: "+ faixa2);
			System.out.println("pessoas na 3º Faixa etária: "+ faixa3);
			System.out.println("pessoas na 4º Faixa etária: "+ faixa4);
			System.out.println("pessoas na 5º Faixa etária: "+ faixa5);
			
	
			porcent = faixa1*100/15;
			porcent2 = faixa2*100/15;
			porcent3 = faixa3*100/15; 
			porcent4 = faixa4*100/15;
			porcent5 = faixa5*100/15;
			
			System.out.println(porcent+"% das pessoas fazem parte da 1º Faixa etária");
			System.out.println(porcent2+"% das pessoas fazem parte da 2º Faixa etária");
			System.out.println(porcent3+"% das pessoas fazem parte da 3º Faixa etária");
			System.out.println(porcent4+"% das pessoas fazem parte da 4º Faixa etária");
			System.out.println(porcent5+"% das pessoas fazem parte da 5º Faixa etária");
	}
}

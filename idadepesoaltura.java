import java.util.Scanner;
public class idadePesoAltura {


	public static void main(String[] args) {

		Scanner idadescan = new Scanner(System.in);
		Scanner alturascan = new Scanner(System.in);
		Scanner pesoscan = new Scanner(System.in);
		int PessSup50;
		double idade, altura, peso, mediaAlt, idade1020, pesoinf40, maioridade, menoridade, pesomaior, pesomenor;
		
		PessSup50 = 0;
		mediaAlt = 0;
		idade1020 = 0;
		pesoinf40 = 0;
		maioridade = 0;
		menoridade = 0;
		pesomaior = 0;
		pesomenor = 0;
		
		for(int i=1; i<=25; i++) {
	
			System.out.println("Escreva sua idade");
            idade = idadescan.nextInt();

            System.out.println("Escreva sua altura");
            altura = alturascan.nextDouble();

            System.out.println("Escreva seu peso");
            peso = pesoscan.nextDouble();
	
            if(idade>=50) {
            	PessSup50++;
            }
            
            if(idade >= 10 && idade <=20) {
            	idade1020++;
            	mediaAlt = mediaAlt + altura;
            }
            
            if(peso<40){
            	pesoinf40++;
            }
            
            if(idade>maioridade) {
            	maioridade = idade;
            	pesomaior = peso;
            	menoridade = maioridade;
            } else if(idade<menoridade) {
            	menoridade = idade;
            	pesomenor = peso;
            }
            
          
            
		}
		
		System.out.println("O total de pessoas com idade superior a 50 são: "+PessSup50);
			
			mediaAlt = mediaAlt/idade1020;
		System.out.println("a média da altura das pessoas de 10 a 20 anos de idade é: "+ mediaAlt);	
	
			pesoinf40 = pesoinf40*100/25;
		System.out.println("A porcentagem de pessoas com o peso abaixo de 40 é: "+pesoinf40);	
	
		System.out.println("o peso da pessoa mais velha é: "+ pesomaior);
		System.out.println("o peso da pessoa mais nova é: "+ pesomenor);
	}
}

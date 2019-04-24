package provadeprogramação1;

import java.util.Scanner;

public class Carros {		

	
	private String carro;
	private String cor;
	private double quilometro;

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public double getQuilometro() {
		return quilometro;
	}

	public void setQuilometro(double quilometro) {
		this.quilometro = quilometro;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	// MOSTRA TODOS CARROS DISPONIVEIS NA CONCECIONARIA
	void carros_disponiveis() {

		String[] carro = new String[] {"Lamborghini Gallardo", "Jinbei Passageiro" , "Jaguar Supersport" ,
				"Honda Civic" , "Fiat Fiesta","Porsche Panamera", "Fiat Fiesta", "Subaru Jimny" , "Porsche Cayenne", 
				"Jinbei Passageiro", "Volkswagen Passat","Peugeot Hoggar","Volkswagen Passat","Peugeot Hoggar"
		};


		String[] cor = new String[] { " Preto"," Amarelo "," Branco navajo"," Ouro"," Preto"," Amarelo "," Preto"
				," Branco navajo"," Branco navajo", " Preto", " Preto",	"Cinza fosco",	" Branco navajo", " Ouro"
		};
		
		double[] quilo = new double[] { 54.0000 , 10.1000 , 20.0000 , 30.0000 , 55.0000 , 20.3200 , 54.0000 , 80.650 ,
				54.0000, 55.0000 , 54.0000, 20.2200 , 66.0000, 20.0000					
		};
		
	


		System.out.println("LISTA DE CARROS DA ESTACIO DE SÁ LOCADORAS");	
		
		
		for (int cont = 0; cont < carro.length; cont++) {
			
			if (carro != null) {
				int contagem = cont + 1;
				System.out.printf("%d Carro: %s Cor %s Km %.4f\n", contagem, carro[cont], cor[cont], quilo[cont]);
			}


		}
	}

	// MOSTRAS OS CARROS DISPONIVEIS NO MOMENTO
	void carros_indisponiveis () {
		
	
		
		//DEFINE OS CARROS DISPONIVEIS
		String[] carro = new String[11];
		carro[0] = "Lamborghini Gallardo";
		carro[1] = "Jinbei Passageiro";
		carro[2] = "Jaguar Supersport";
		carro[3] = "Honda Civic";
		carro[4] = "Fiat Fiesta";
		carro[5] = "Porsche Cayenne";
		carro[6] = "Porsche 911 ";
		carro[7] = "Porsche Panamera";
		carro[8] = "Porsche Cayenne";
		carro[9] = "Peugeot Sedan";
		carro[10] = "Peugeot Hoggar";
		
		
		//SELECIONA A COR DOS CARROS DISPONIVEIS
		String[] cor = new String [11];
		cor[0] = " Preto";
		cor[1] = " Amarelo ";
		cor[2] = " Amarelo ";
		cor[3] = " Ameixa";
		cor[4] = " Azul ";
		cor[5] = " Azul ardósia";
		cor[6] = " ardósia escuro";
		cor[7] = " Branco navajo";
		cor[6] = " Branco floral";
		cor[9] = " Branco antigo";
		cor[10] = " Bronze";
		
		//SELECIONA A QUILOMETRAGEM
		double [] quilo= new double [11];
		quilo[0] = 54.0000;
		quilo[1] = 10.1000;
		quilo[2] = 20.0000;
		quilo[3] = 30.0000;
		quilo[4] = 55.0000;
		quilo[5] = 54.0000;
		quilo[6] = 44.0000;
		quilo[7] = 20.2200;
		quilo[8] = 54.0000;
		quilo[9] = 66.0000;
		quilo[10] = 20.3230;
		
		System.out.println("LISTA DE CARROS DISPONIVEIS DA APS LOCADORA");		
		
		for (int cont = 0; cont < 11; cont++) {
			int contagem = cont + 1;
			System.out.printf("%d Carro: %s Cor %s Km %.4f\n", contagem, carro[cont], cor[cont], quilo[cont]);

		}
		
		//NESTA PARTE SERA SELECIONADO OS CARROS 
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Escolha um Carro da lista");
		System.out.print("Enter:");
		int menu = input.nextInt();		
		
		
		switch (menu) {
		case 1:
			System.out.println(carro[0]+ cor[0] + quilo[0] + " Carro Alugado!!");	
		break;
		
		case 2:
			System.out.println(carro[1] + cor[1] + quilo[1] +" Carro Alugado!!");			
		break;
		
		
		case 3:
			System.out.println(carro[2] + cor[2] + quilo[2] +" Carro Alugado!!");		
		break;
		
		
		case 4:
			System.out.println(carro[3] + cor[3] + quilo[3] +" Carro Alugado!!");			
		break;
		
		case 5:
			System.out.println(carro[4] + cor[4] + quilo[4] +" Carro Alugado!!");			
		break;
		
		case 6:
			System.out.println(carro[5] + cor[5] + quilo[5] +" Carro Alugado!!");			
		break;
		
		case 7:
			System.out.println(carro[6] + cor[6] + quilo[6] +" Carro Alugado!!");		
		break;
		
		case 8:
			System.out.println(carro[7] + cor[7] + quilo[7] +" Carro Alugado!!");			
		break;
		
		case 9:
			System.out.println(carro[8] + cor[8] + quilo[8] +" Carro Alugado!!");		
		break;
		
		case 10:
			System.out.println(carro[9] + cor[9] + quilo[9] +" Carro Alugado!!");		
		break;
		
		case 11:
			System.out.println(carro[10] + cor[10] + quilo[10] +" Carro Alugado!!");			
		break;
		
		default: 
			System.out.println("Insita um valor valido!! ");
		break;	
		}		
				
		input.close();
}
		
}

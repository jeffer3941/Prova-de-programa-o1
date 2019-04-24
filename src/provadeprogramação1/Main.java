package provadeprogramação1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);

		Carros car = new Carros();
		Pessoa cliente = new Pessoa();		
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy"); // AQUI VAI INSTANCIAR UM MODELO DE DATA 	
		
		Calendar cal = Calendar.getInstance(); // AQUI É UM TIPO MIAS ANTIGO ONDE VOU PODER FAZER A SOMA DA DATA 
					
			
			Date dia1 = new Date(); // AQUI ELE VAI PEGAR A DATA DO SISTEMA 
			System.out.println("Bem vindo a Locadora APS");
			System.out.println("Data:"+ data.format(dia1)); // IMPRIMIR A DATA DO SISTEMA 
			System.out.println("Entre com as informções seguintes para utilizar o sistema");
			System.out.println("1: Para fazer cadastro");
			System.out.println("2: Para ver os carros disponiveis");
			System.out.print("Enter:");
			int entrada = input.nextInt();
		
			do {
				switch (entrada) {
				// REALIZA O CADASTRO DO PROGRAMA
				case 1:
					System.out.print("Nome:");
					input.nextLine();
					String nome = input.nextLine();				
					System.out.print("RG:");
					String rg = input.nextLine();
					System.out.print("CPF:");
					String cpf = input.nextLine();
					System.out.print("Endereço:");
					String ende = input.nextLine();
					System.out.print("Telefone:");
					String tele = input.nextLine();
					System.out.print("Idade:");
					int idade = input.nextInt();

					cliente.setNome(nome);
					cliente.mostrarNatela(nome,cpf,rg,ende,tele,idade);

					cliente.menuDoaluguelcarro();				
					//ESSA É A PARTE DO INCREMENTO DA DATA 
					cal.setTime(dia1);
					cal.add(Calendar.DATE, 5); // AQUI SE FAZ O INCREMENTO EU ESCOLHI 5 DIAS PARA ENTREGA 
					dia1 = cal.getTime();
					System.out.println("Data de Entrega: " + data.format(dia1));//IMPRIMIR A DATA SOMADA 

					break;

					case 2:
						car.carros_disponiveis();								
					break;

					default:
						System.out.println("Insira um valor valido para o menu!!");
					break;

				}
			} while (entrada < 1 || entrada > 2 );

		}
	
}
		



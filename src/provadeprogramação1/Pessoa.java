package provadeprogramação1;

import java.util.Scanner;

public class Pessoa {
	
	private String nome;
	private String endereço;
	private String rg;
	private String cpf;	
	private String telefone;
	

	private int idade;

	Scanner input = new Scanner(System.in);
	Carros lista = new Carros();
	
	//Secção de get
	
	public String getTelefone() {
		return telefone;
	}


	public String getEndereço() {
		return endereço;
	}

	public String getRg() {
		return rg;
	}
	
	public String getCpf() {
		return cpf;
	}

	
	public String getNome() {
		return nome;
	}
		
	
	public int getIdade() {
		return idade;
	}

	
	//Fim da Secção de get

	public void setRg(String rg) {
		this.rg = rg;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
		

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public void setIdade(int idade) {
		this.idade = idade;
	
	}
	

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
	//MOTRA NA TELA OS DADOS INSERIDOS ATÉ O MOMENTO
	public void mostrarNatela (String nome , String cpf , String rg , String ende , String tele ,  int idade )
	{
				 
		System.out.println("Informações passadas");
		System.out.println("Nome:"+ getNome());
		System.out.println("Idade:"+idade + " anos");
		System.out.println("CPF:"+ cpf);
		System.out.println("RG:"+ rg);
		System.out.println("Endereço:"+ ende);
		System.out.println("Telefone:"+ tele);
	}	

	//MENU DE SELEÇÃO DO ALUGUEL DO CARRO
	public void menuDoaluguelcarro() {		
		System.out.println(getNome() + " Deseja Alugar um Carro");
		System.out.println("Digite 'Y'  para sim ");
		System.out.println("Digite 'N'  para Não ");		
		System.out.println("Enter:");char entrada = input.next().charAt(0);
		
		switch (entrada) {
		
		//CHAMA A SELEÇÃO DO CARRO

		case 'y':			
			lista.carros_indisponiveis ();
		break;
		case 'n':
		System.out.println("Obrigado e Volte Sempre!!");
		break;	
		}
	
}
	
}
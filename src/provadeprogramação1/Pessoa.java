package provadeprograma��o1;

import java.util.Scanner;

public class Pessoa {
	
	private String nome;
	private String endere�o;
	private String rg;
	private String cpf;	
	private String telefone;
	

	private int idade;

	Scanner input = new Scanner(System.in);
	Carros lista = new Carros();
	
	//Sec��o de get
	
	public String getTelefone() {
		return telefone;
	}


	public String getEndere�o() {
		return endere�o;
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

	
	//Fim da Sec��o de get

	public void setRg(String rg) {
		this.rg = rg;
	}


	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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


	
	//MOTRA NA TELA OS DADOS INSERIDOS AT� O MOMENTO
	public void mostrarNatela (String nome , String cpf , String rg , String ende , String tele ,  int idade )
	{
				 
		System.out.println("Informa��es passadas");
		System.out.println("Nome:"+ getNome());
		System.out.println("Idade:"+idade + " anos");
		System.out.println("CPF:"+ cpf);
		System.out.println("RG:"+ rg);
		System.out.println("Endere�o:"+ ende);
		System.out.println("Telefone:"+ tele);
	}	

	//MENU DE SELE��O DO ALUGUEL DO CARRO
	public void menuDoaluguelcarro() {		
		System.out.println(getNome() + " Deseja Alugar um Carro");
		System.out.println("Digite 'Y'  para sim ");
		System.out.println("Digite 'N'  para N�o ");		
		System.out.println("Enter:");char entrada = input.next().charAt(0);
		
		switch (entrada) {
		
		//CHAMA A SELE��O DO CARRO

		case 'y':			
			lista.carros_indisponiveis ();
		break;
		case 'n':
		System.out.println("Obrigado e Volte Sempre!!");
		break;	
		}
	
}
	
}
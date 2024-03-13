package br.treino.heranca.versus.composicaoEInterface.Funcionarios;

public abstract class Funcionario {

	private String nome;
	private String cargo;
	private int idade;
	private double salario;
	private int totalDeHorasTrabalhadas;
	
	public Funcionario() {
		
	}
	
	public void calcularSalarioPorHora(int quantidadeDeHoras, double valorDoSalario) {
		this.salario = quantidadeDeHoras * valorDoSalario;
		this.totalDeHorasTrabalhadas = quantidadeDeHoras;
	}
	
	public void getBonificacaoDeSalario() {
		if(this.totalDeHorasTrabalhadas > 170) {
			System.out.println("Funcion�rio recebeu bonifica��o!");
			System.out.println("Sal�rio antes da bonifica��o: " + "R$" + this.salario);
			double salarioAnterior = this.salario;
			double bonus = 500;
			
			this.salario = this.salario + bonus;
			System.out.println("Sal�rio depois da bonifica��o: " + "R$" + salarioAnterior + " + " +  "R$" + bonus + " = " + "R$" + this.salario 
					);	
		} else {
			System.out.println("Esse funcion�rio n�o atingiu as horas minimas para obter bonifica��o!");
		}
	}

	public void imprimeInformacoesDoFuncionario() {
		System.out.println(
				"\nNome do funcion�rio: " + this.nome  + 
				"\nCargo do funcion�rio: " + this.cargo +
				"\nIdade do funcion�rio: " + this.idade + " anos" + 
				"\nSalario do funcion�rio: " +  "R$" + this.salario +
				"\nTotal de horas trabalhadas: " + totalDeHorasTrabalhadas + " horas" + "\n"
				);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}

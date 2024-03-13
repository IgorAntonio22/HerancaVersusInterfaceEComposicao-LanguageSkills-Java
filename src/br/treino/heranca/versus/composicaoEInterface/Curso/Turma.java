package br.treino.heranca.versus.composicaoEInterface.Curso;

import java.time.LocalDate;

public class Turma {

	private LocalDate  dataInicio;
	private LocalDate dataTermino;
	private int vagasDisponiveis;
	
	public Turma() {
		
	}
	
	@Override
	public String toString() {
		return "\nData De In�cio: " + this.dataInicio +
				"\nData de T�rmino: " + this.dataTermino +
				"\nVagas Dispon�veis: " + this.vagasDisponiveis + " vagas " + "\n"
				;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}

	public void setVagasDisponiveis(int vagasDisponiveis) {
		this.vagasDisponiveis = vagasDisponiveis;
	}

	
	
	
	

}

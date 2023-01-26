package br.com.trabalhofinal.model;

import java.util.HashMap;
import java.util.Random;

import br.com.trabalhofinal.model.Enum.EnumAvaliacao;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public abstract class AlgoritmoIA {
	private Random gerador;
	private EnumTipoTarefa tipoTarefa;
	
	protected AlgoritmoIA(EnumTipoTarefa tipoTarefa, Fitter fitter) {
		this.gerador = new Random();
		this.tipoTarefa = tipoTarefa;
	}
	
	public static void main(String[] args) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("param1", "ashdahs");
		System.out.println(params.get("param1"));
		
	}
	
	public abstract void fit();
	
	public String predict(){
		if(tipoTarefa.equals(EnumTipoTarefa.CLASSIFICACAO)) {
			Integer value = this.gerador.nextInt();
			return value.toString();
		} 
		// Caso o tipo de tarefa seja Regressão
		else {
			Double value = gerador.nextDouble();
			return value.toString();
		}
	}
	
	public EnumAvaliacao avaliaModelo() {
		int indexDesempenho = gerador.nextInt(4);
		return EnumAvaliacao.values()[indexDesempenho];
	}
	
	protected abstract void imprimeDadosEspecificos();
	
	public void imprimeModelo() {
		System.out.println("Tipo de tarefa: " + this.tipoTarefa.toString());
		System.out.println("Modo: " + this.getFitter().getModo());
		imprimeDadosEspecificos();
	}
	
	public EnumTipoTarefa getTipoTarefa() {
		return tipoTarefa;
	}	
	
	public abstract Fitter getFitter();
}

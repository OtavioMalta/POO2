package br.com.trabalhofinal.model.impl;

import java.util.HashMap;

import br.com.trabalhofinal.model.Fitter;
import br.com.trabalhofinal.model.Enum.EnumModo;

public class FitterArvoreDeDecisao implements Fitter {
	EnumModo modo;
	boolean primeiraChamada;
	
	public FitterArvoreDeDecisao() {
		super();
		this.modo = EnumModo.UNFITTED;
		this.primeiraChamada = true;
	}


	@Override
	public EnumModo getModo() {
		return this.modo;
	}


	@Override
	public void fit(HashMap<String, String> params) {
		if(primeiraChamada) {
			System.out.println("Primeira chamada do fit(): passando de UNFITTED para FITTED");
			this.modo = EnumModo.FITTED;
			primeiraChamada = false;
		}
		
		System.out.println("Ajustando modelo com as configurações: ");
		System.out.println("-- Número de Árvores: " + params.get("numeroDeArvores")); 
		System.out.println("-- Medida de Informação: " + params.get("medidaDeInformacao"));
	}


	@Override
	public void setModo(EnumModo modo) {
		this.modo = modo;
	}

}

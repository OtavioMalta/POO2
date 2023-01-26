package br.com.trabalhofinal.model;

import java.util.HashMap;

import br.com.trabalhofinal.model.Enum.EnumMedidaDeProximidade;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;
import br.com.trabalhofinal.model.impl.FitterKvizinhos;

public class KVizinhos extends AlgoritmoIA {
	private Integer numeroDeVizinhos;
	private EnumMedidaDeProximidade medidaDeProximidade;
	private Fitter fitter;
	
	public KVizinhos(EnumTipoTarefa tipoTarefa, int numeroDeVizinhos,
			EnumMedidaDeProximidade medidaDeProximidade) {
		
		super(tipoTarefa, new FitterKvizinhos());
		this.numeroDeVizinhos = numeroDeVizinhos;
		this.medidaDeProximidade = medidaDeProximidade;
		this.fitter = new FitterKvizinhos();
	}


	@Override
	protected void imprimeDadosEspecificos() {
		System.out.println("Número de vizinhos: " + numeroDeVizinhos);
		System.out.println("Medida de proximidade: " + medidaDeProximidade);
		System.out.println("Algoritmo: K-Vizinhos");
		
	}


	@Override
	public void fit() {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("numeroDeVizinhos", numeroDeVizinhos.toString());
		params.put("medidaDeProximidade", medidaDeProximidade.toString());
		this.fitter.fit(params);
	}


	@Override
	public Fitter getFitter() {
		return this.fitter;
	}
	
	
}

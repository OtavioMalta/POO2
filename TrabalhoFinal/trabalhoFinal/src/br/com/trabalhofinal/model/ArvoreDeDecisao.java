package br.com.trabalhofinal.model;

import java.util.HashMap;

import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;
import br.com.trabalhofinal.model.impl.FitterArvoreDeDecisao;

public class ArvoreDeDecisao extends AlgoritmoIA {
	
	private Integer numeroDeArvores;
	private Double medidaDeInformacao;
	
	private Fitter fitter;
	public ArvoreDeDecisao(EnumTipoTarefa tipoTarefa, int numeroDeArvores, double medidaDeInformacao) {
		super(tipoTarefa, new FitterArvoreDeDecisao());
		this.numeroDeArvores = numeroDeArvores;
		this.medidaDeInformacao = medidaDeInformacao;
		this.fitter = new FitterArvoreDeDecisao();
	}

	@Override
	protected void imprimeDadosEspecificos() {
		System.out.println("Número de árvores: " + this.numeroDeArvores);
		System.out.println("Medida de informação: " + this.medidaDeInformacao);
		System.out.println("Algoritmo: Árvore de Decisão");
	}

	@Override
	public void fit() {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("numeroDeArvores",numeroDeArvores.toString());
		params.put("medidaDeInformacao", medidaDeInformacao.toString());
		fitter.fit(params);
	}

	@Override
	public Fitter getFitter() {
		return this.fitter;
	}
	


}

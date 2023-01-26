package br.com.trabalhofinal.model;

import java.util.HashMap;

import br.com.trabalhofinal.model.Enum.EnumFuncaoDeAtivacao;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;
import br.com.trabalhofinal.model.impl.FitterRedeNeuralArtificial;

public class RedeNeuralArtificial extends AlgoritmoIA {
	
	private Integer numeroDeCamadas;
	private Integer neuroniosPorCamada;
	private EnumFuncaoDeAtivacao funcaoDeAtivacao;
	private Double taxaDeAprendizado;
	private Fitter fitter;
	
	public RedeNeuralArtificial(EnumTipoTarefa tipoTarefa, int numeroDeCamadas, int neuroniosPorCamada,
			EnumFuncaoDeAtivacao funcaoDeAtivacao, double taxaDeAprendizado) {
		super(tipoTarefa, new FitterRedeNeuralArtificial());
		this.numeroDeCamadas = numeroDeCamadas;
		this.neuroniosPorCamada = neuroniosPorCamada;
		this.funcaoDeAtivacao = funcaoDeAtivacao;
		this.taxaDeAprendizado = taxaDeAprendizado;
		this.fitter = new FitterRedeNeuralArtificial();
	}

	@Override
	protected void imprimeDadosEspecificos() {
		System.out.println("Número de Camadas: " + numeroDeCamadas);
		System.out.println("Número de Neurônios por Camada: " + neuroniosPorCamada);
		System.out.println("Função de Ativação: " + funcaoDeAtivacao);
		System.out.println("Taxa de Aprendizado: " + taxaDeAprendizado);
		
	}

	@Override
	public void fit() {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("numeroDeCamadas", numeroDeCamadas.toString());
		params.put("neuroniosPorCamada", neuroniosPorCamada.toString());
		params.put("funcaoDeAtivacao", funcaoDeAtivacao.toString());
		params.put("taxaDeAprendizado", taxaDeAprendizado.toString());		
		fitter.fit(params);
	}

	@Override
	public Fitter getFitter() {
		return this.fitter;
	}

}

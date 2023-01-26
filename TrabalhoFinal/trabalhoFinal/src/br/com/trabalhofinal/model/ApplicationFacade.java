package br.com.trabalhofinal.model;

import br.com.trabalhofinal.model.Enum.EnumAvaliacao;
import br.com.trabalhofinal.model.Enum.EnumModo;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public class ApplicationFacade {
	private AlgoritmoIA algoritmo;

	public ApplicationFacade(AlgoritmoIA algoritmoIA){
		this.algoritmo = algoritmoIA;
	}
	public void fit() {
		carregaDados();
		normalizaDados();
		algoritmo.fit();
		System.out.println("Avaliando modelo...");
		EnumAvaliacao desempenho = algoritmo.avaliaModelo();

		switch (desempenho) {
		case INSATISFATORIO:
			System.out.println("O desempenho do modelo é INSATISFATORIO. Retornando modelo para modo UNFITTED");
			System.out.println("Será necessário ajustar o modelo novamente.");
			algoritmo.getFitter().setModo(EnumModo.UNFITTED);
			break;

		case REGULAR:
			System.out.println("O desempenho do modelo é REGULAR. Entrando no modo ITERFIT");
			algoritmo.getFitter().setModo(EnumModo.ITERFIT);
			break;
		// Default será no caso de BOM ou MUITO_BOM
		default:
			System.out.println("O modelo é " + desempenho + ". Permanecerá no modo FITTED");
			if (!algoritmo.getFitter().getModo().equals(EnumModo.FITTED))
				algoritmo.getFitter().setModo(EnumModo.FITTED);
			break;
		}
	}
	
	public void predict() {
		EnumModo modoAtual = algoritmo.getFitter().getModo();
		switch (modoAtual) {
		case UNFITTED:
			System.out.println("O modo atual (UNFITTED) não permite predição de dados.");
			System.out.println("Selecione a opção fit para realizar o ajuste do modelo.");
			break;

		case ITERFIT:
			executePredict();
			System.out.println("O modo atual é ITERFIT. Realizado ajuste no modelo.");
			algoritmo.fit();
			break;

		case FITTED:
			executePredict();
			break;

		default:
			System.out.println("Modo de funcionamento inválido");
			break;
		}
	}

	private void executePredict() {
		System.out.println("Recebendo novo dado..");
		System.out.println("Carredando o modelo de aprendizado ajustado anteriormente...");
		System.out.println("Predizendo o valor..");

		System.out.print("Valor Predito: ");

		if (algoritmo.getTipoTarefa().equals(EnumTipoTarefa.CLASSIFICACAO)) {
			Integer valorPredito = Integer.parseInt(algoritmo.predict());
			System.out.println(valorPredito + "\n");
		} else {
			Double valorPredito = Double.parseDouble(algoritmo.predict());
			System.out.println(valorPredito + "\n");
		}
	}

	public void imprimeModelo() {
		algoritmo.imprimeModelo();
	}

	private void carregaDados() {
		System.out.println("Carregando dados...");
	}

	private void normalizaDados() {
		System.out.println("Normalizando dados...");
	}
}

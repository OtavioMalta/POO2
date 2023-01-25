package br.com.trabalhofinal.view;

import java.util.Scanner;

import br.com.trabalhofinal.model.AlgoritmoIA;
import br.com.trabalhofinal.model.ApplicationFacade;
import br.com.trabalhofinal.model.ArvoreDeDecisao;
import br.com.trabalhofinal.model.KVizinhos;
import br.com.trabalhofinal.model.RedeNeuralArtificial;
import br.com.trabalhofinal.model.Enum.EnumFuncaoDeAtivacao;
import br.com.trabalhofinal.model.Enum.EnumMedidaDeProximidade;
import br.com.trabalhofinal.model.Enum.EnumTipoTarefa;

public class AlgoritmosView{

    public AlgoritmosView (){
        
    }

    public void menu(Scanner sc){
        int opcaoAlgoritmo;
        System.out.println("\nEscolha um Algoritmo: ");
        System.out.println("1) Arvore de decisão");
        System.out.println("2) KVizinhos");
        System.out.println("3) Rede Neural Artificial");
        opcaoAlgoritmo = sc.nextInt();

        switch (opcaoAlgoritmo) {
            case 1:{
                ApplicationFacade facade = iniciaArvoreDecisao(sc);
                acao(facade, sc);
                limparConsole();
                menu(sc);
                break;
            }
            
            case 2:{
                ApplicationFacade facade = iniciaKVizinhos(sc);
                acao(facade, sc);
                limparConsole();
                menu(sc);
                break;
            } 

            case 3:{
                ApplicationFacade facade = iniciaRedeNeuralArtificial(sc);
                acao(facade, sc);
                limparConsole();
                menu(sc);
                break;
            }
            case 0:{
                break;
            }
        }
        
    }

    public ApplicationFacade iniciaArvoreDecisao(Scanner sc){
        Integer tipoTarefa = 0;
        limparConsole();
        do {
            limparConsole();
            System.out.println("\nTipo de Tarefa: ");
            System.out.println("1) Classificação");
            System.out.println("2) Regressão");
            tipoTarefa= sc.nextInt();
        } while (tipoTarefa < 1 || tipoTarefa > 2);

        System.out.println("\nNúmero de Árvores: ");
        Integer numeroArvores = sc.nextInt();
        
        System.out.println("\nMedida de Informação: ");
        Double medidaInformacao = sc.nextDouble();

        AlgoritmoIA algoritmoIA = new ArvoreDeDecisao(EnumTipoTarefa.values()[tipoTarefa-1], numeroArvores, medidaInformacao);
        ApplicationFacade facade = new ApplicationFacade(algoritmoIA);
        limparConsole();
        
        return facade;
    }
    
    public ApplicationFacade iniciaKVizinhos(Scanner sc){
        Integer tipoTarefa = 0;
        limparConsole();
        do {
            limparConsole();
            System.out.println("\nTipo de Tarefa: ");
            System.out.println("1) Classificação");
            System.out.println("2) Regressão");
            tipoTarefa= sc.nextInt();
        } while (tipoTarefa < 1 || tipoTarefa > 2);


        System.out.println("\nNúmero de Vizinhos: ");
        Integer numeroVizinhos = sc.nextInt();

        Integer medidaProximidade=0;
        do {
            System.out.println("\nMedida de Proximidade: ");
            System.out.println("1) DISTANCIA EUCLIDIANA");
            System.out.println("2) DISTANCIA DE MANHATTAN");
            System.out.println("3) DISTANCIA DE MINKOWSKI");
            medidaProximidade = sc.nextInt();
            limparConsole();
        } while (medidaProximidade > 3 || medidaProximidade < 1);
        

        AlgoritmoIA algoritmoIA = new KVizinhos(
            EnumTipoTarefa.values()[tipoTarefa-1], 
            numeroVizinhos, 
            EnumMedidaDeProximidade.values()[medidaProximidade-1]);

        ApplicationFacade facade = new ApplicationFacade(algoritmoIA);
        limparConsole();
        
        return facade;
    }

    public ApplicationFacade iniciaRedeNeuralArtificial(Scanner sc){
        Integer tipoTarefa = 0;
        limparConsole();
        do {
            limparConsole();
            System.out.println("\nTipo de Tarefa: ");
            System.out.println("1) Classificação");
            System.out.println("2) Regressão");
            tipoTarefa= sc.nextInt();
        } while (tipoTarefa < 1 || tipoTarefa > 2);


        System.out.println("\nNúmero de Camadas: ");
        Integer numeroCamadas = sc.nextInt();
        
        System.out.println("\nNeuronios por Camada: ");
        Integer neuroniosCamada = sc.nextInt();

        Integer funcaoAtivacao = 0;
        do {
            System.out.println("\nFunção de Ativação: ");
            System.out.println("1) SOFTMAX");
            System.out.println("2) SIGMOIDE_LOGISTICA");        
            System.out.println("3) TANGENTE_HIPERBOLICA");
            funcaoAtivacao = sc.nextInt();
        } while (funcaoAtivacao < 1 || funcaoAtivacao > 3);

        System.out.println("\nTaxa de Aprendizado: ");
        Integer taxaAprendizado = sc.nextInt();
        
        AlgoritmoIA algoritmoIA = new RedeNeuralArtificial(
            EnumTipoTarefa.values()[tipoTarefa-1], 
            numeroCamadas, 
            neuroniosCamada,
            EnumFuncaoDeAtivacao.values()[funcaoAtivacao-1], 
            taxaAprendizado);

        ApplicationFacade facade = new ApplicationFacade(algoritmoIA);
        limparConsole();
        
        return facade;
    }

    public void acao(ApplicationFacade facade, Scanner sc){
        Integer acao = 1;
        while(acao != 0){
            System.out.println("\nEscolha uma ação: ");
            System.out.println("1) Fit");
            System.out.println("2) Predict");
            System.out.println("3) Imprimir Modelo");
            System.out.println("0) Menu");

            acao = sc.nextInt();
            limparConsole();
            switch(acao){
                case(1):{
                    facade.fit();
                }
    
                case(2):{
                    facade.predict();
                }
    
                case(3):{
                    facade.imprimeModelo();
                }
                
            }
        }
        
    }

    public static void limparConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}

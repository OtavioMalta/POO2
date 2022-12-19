package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.PessoaController;
import model.Pessoa;

public class PessoaView {

	 	PessoaController PessoaController;
	    
	    public PessoaView() {
	        this.PessoaController = new PessoaController();
	    }

	    public void menuPessoa(){
	    	int op;
	    	System.out.println("Menu");
	    	System.out.println("1) Cadastrar");
	    	System.out.println("2) Listar");
	    	System.out.println("0) Sair");
	    	Scanner sc = new Scanner(System.in);
	    	op = sc.nextInt();
	    	switch (op) {
				case 1:{
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Cadastrar Pessoa: ");
					String nome;
					System.out.println("Nome: ");
					nome = sc1.nextLine();

					String cpf;
					System.out.println("Cpf: ");
					cpf = sc1.nextLine();

					Pessoa pessoa = new Pessoa(nome, cpf);
					save(pessoa);
			        menuPessoa();
			        break;
		        }
				
				case 2:{
					ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

					pessoas = (ArrayList<Pessoa>) findAll();
				
					System.out.println("   Lista   ");
					if(pessoas != null && pessoas.size() > 0) {
						for(Pessoa p : pessoas){
							System.out.println("Nome: " + p.getNome());
							System.out.println("CPF: " + p.getCpf());
						}
					}else {
						System.out.println("Nenhuma pessoa encontrada!");
					}
			        menuPessoa();
					break;
		        }
				case 0:{
					break;
				}
	    	}
	    }

		public Pessoa save(Pessoa a){
	    	return PessoaController.save(a);
	    }
		
		public List<Pessoa> findAll(){
			return PessoaController.findAll();
		}
}

package tarefa3;
public class ex2 {
	
	/*
	 * Tempo médio de execução 2,4584
	 */
	
	public static void main(String[] args) {
		int primeiro = 0;
		int ultimo = 9999;
		
		for(int i = 0; i < (ultimo-99); i+=99) {
			int auxPrimeiro = primeiro;
			primeiro+= 100;
			if(i == 0) {
				primeiro--;
			}else {
				auxPrimeiro++;
				i++;
			}
			ClasseThread t = new ClasseThread("T"+i, auxPrimeiro , primeiro);
			t.start();
		}
	}
}
class ClasseThread extends Thread {
	private String nome;
	private int p, u;
	Thread t;
	
	ClasseThread(String nome, int p, int u){
		this.nome = nome;
		this.p = p;
		this.u = u;
		System.out.println("Construtor para a thread " + nome);
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + nome + " em execucao.");
		try {
			  for (int i = p; i<= u; i++) {
		            if(primo(i)){
		            	System.out.println(i);
		            }
		        }
		}catch (Exception e) {
	         System.out.println("Thread " +  nome + " interrompida.");
	    }
	}
	public static boolean primo(Integer v) {
		for(Integer d = 2; v > d; d++) {
			if(v % d == 0) {
				return false;
			}
		}
	return true;
	}
	
	public void start () {
	      System.out.println("Starting " +  nome );
	      if (t == null) {
	         t = new Thread (this, nome);
	         t.start ();
	      }
	   }
}

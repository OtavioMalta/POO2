package tarefa3;

public class ex1 {
	
	/*
	 * Tempo médio de execução: 2,6785
	 */
	
	public static void main(String[] args) {
		int primeiro = 0;
		int ultimo = 9999;
		
		// O(n)
		for(int v = primeiro; v <= ultimo; v++) {
			if(primo(v)) {
				System.out.println(v);
			}
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
}

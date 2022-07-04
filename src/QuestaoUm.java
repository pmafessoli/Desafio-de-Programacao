package desafio.logica.sci;

/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoUm {
	
	//Um saco de biscoitos contém 40 unidades que, de acordo com as informações do rótulo, equivalem a 10 porções. Ainda de acordo com orótulo, uma porção possui 300 calorias. Baseado nessas informações, crie um algoritmo que permita ao usuário inserir o número de biscoitos
	//que ele consumiu e imprima na tela a quantidade de calorias correspondentes.
	
	private int biscoito;

	public int getBiscoito() {
		return biscoito;
	}

	public void setBiscoito(int biscoito) {
		this.biscoito = biscoito;
	}

	public int calcularCaloria() {
		int caloriaTotal = getBiscoito() * 75;
		return caloriaTotal;
	}
}

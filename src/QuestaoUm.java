package desafio.logica.sci;

/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoUm {
	
	//Um saco de biscoitos cont�m 40 unidades que, de acordo com as informa��es do r�tulo, equivalem a 10 por��es. Ainda de acordo com or�tulo, uma por��o possui 300 calorias. Baseado nessas informa��es, crie um algoritmo que permita ao usu�rio inserir o n�mero de biscoitos
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

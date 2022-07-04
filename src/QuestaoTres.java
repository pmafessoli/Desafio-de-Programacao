package desafio.logica.sci;

/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoTres {

//	3) A Granja Galinha Feliz vende ovos orgânicos vermelhos por R$ 3,25 a
//	dúzia ou R$ 0,45 por unidade avulsa. Sabendo disso, escreva um
//	programa que solicite ao usuário o número de ovos vendidos a um
//	cliente e exiba o valor total devido com uma explicação apropriada. Por
//	exemplo, se um cliente comprou 27 ovos, isso resulta em 2 dúzias e 3
//	ovos; ou seja: duas dúzias a R$ 3,25 por dúzia e três ovos avulsos a 45
//	centavos cada, totalizando de R$ 7,85

	private int qtdOvos;
	private float valorDuzia = 3.25f;
	private float valorUnitario = 0.45f;

	public int getQtdOvos() {
		return qtdOvos;
	}

	public void setQtdOvos(int qtdOvos) {
		this.qtdOvos = qtdOvos;
	}

	public float getCalculoCompra() {
		float valorCompraDuzia, valorCompraUnitaria = 0;
		if (getQtdOvos() % 12 == 0) {
			valorCompraDuzia = getQtdOvos() / 12 * valorDuzia;
			return valorCompraDuzia;
		} else {
			float qtdDuzia = getQtdOvos() / 12;
			Math.sqrt(qtdDuzia);
			valorCompraUnitaria = (getQtdOvos() % 12 * valorUnitario) + (qtdDuzia * valorDuzia);
		}
		return valorCompraUnitaria;
	}

	public String toString() {
		int recebeDuzia = getQtdOvos() / 12;
		int recebeResto = qtdOvos % 12;

		if (getQtdOvos() % 12 == 0) {

			return "O valor da sua compra é de R$ " + getCalculoCompra() + " correspondente a " + recebeDuzia
					+ " duzias";
		}

		return "O valor da sua compra é de R$ " + getCalculoCompra() + " correspondente a " + recebeDuzia + " duzias e " 
		+  recebeResto + " ovos extras";
	}

}

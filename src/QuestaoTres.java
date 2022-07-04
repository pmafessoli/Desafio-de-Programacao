package desafio.logica.sci;

/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoTres {

//	3) A Granja Galinha Feliz vende ovos org�nicos vermelhos por R$ 3,25 a
//	d�zia ou R$ 0,45 por unidade avulsa. Sabendo disso, escreva um
//	programa que solicite ao usu�rio o n�mero de ovos vendidos a um
//	cliente e exiba o valor total devido com uma explica��o apropriada. Por
//	exemplo, se um cliente comprou 27 ovos, isso resulta em 2 d�zias e 3
//	ovos; ou seja: duas d�zias a R$ 3,25 por d�zia e tr�s ovos avulsos a 45
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

			return "O valor da sua compra � de R$ " + getCalculoCompra() + " correspondente a " + recebeDuzia
					+ " duzias";
		}

		return "O valor da sua compra � de R$ " + getCalculoCompra() + " correspondente a " + recebeDuzia + " duzias e " 
		+  recebeResto + " ovos extras";
	}

}

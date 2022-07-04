package desafio.logica.sci;

/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoDois {
//	correspondentes. 2) Crie um algoritmo que solicite ao usuário que informe o número de
//	homens e o número de mulheres matriculadas numa classe e exiba os
//	percentuais equivalentes a cada sexo na tela.

	private int homens;
	private int mulheres;

	public int getHomens() {
		return homens;
	}

	public void setHomens(int homens) {
		this.homens = homens;
	}

	public int getMulheres() {
		return mulheres;
	}

	public void setMulheres(int mulheres) {
		this.mulheres = mulheres;
	}

	public float calcularHomem(float homem) {
		float total = getHomens() + getMulheres();
		return homem = getHomens() * 100 / total;
	}
	
	public float calcularMulher(float mulher) {
		float total = getHomens() + getMulheres();
		return mulher  = getMulheres()*100/total;
	}
	
	public String toString() {
		return calcularHomem(homens) + "% homenns matriculados\n" + calcularMulher(mulheres) + "% mulheres matriculadas" ;
	}
}

package desafio.logica.sci;
/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoSete {

	private int mulherUm;
	private int mulherDois;
	private int homemUm;
	private int homemDois;

	public int getMulherUm() {
		return mulherUm;
	}

	public void setMulherUm(int mulherUm) {
		this.mulherUm = mulherUm;
	}

	public int getMulherDois() {
		return mulherDois;
	}

	public void setMulherDois(int mulherDois) {
		this.mulherDois = mulherDois;
	}

	public int getHomemUm() {
		return homemUm;
	}

	public void setHomemUm(int homemUm) {
		this.homemUm = homemUm;
	}

	public int getHomemDois() {
		return homemDois;
	}

	public void setHomemDois(int homemDois) {
		this.homemDois = homemDois;
	}

	public int getCalculaIdadeMaiorHomem() {
		if (getHomemUm() > getHomemDois()) {
			return homemUm;
		}

		return homemDois;
	}

	public int getCalculaIdadeMaiorMulher() {
		if (getMulherUm() > getMulherDois()) {
			return getMulherUm();
		}

		return mulherDois;
	}

	public int getCalculaMenorIdadeHomem() {
		if (getHomemUm() < homemDois) {
			return getHomemUm();
		}

		return getHomemDois();
	}

	public int getCalculaMenorIdadeMulher() {
		if (getMulherUm() < getMulherDois()) {
			return getMulherUm();
		}

		return getMulherDois();
	}

	public int getCalculaSoma() {
		return getCalculaIdadeMaiorHomem() + getCalculaMenorIdadeMulher();
	}

	public int getCalculaProduto() {
		return getCalculaMenorIdadeHomem() * getCalculaIdadeMaiorMulher();
	}

	public String toString() {

		return "A soma de idade do homem mais velho com mulher mais nova é de: " + getCalculaSoma()
				+ "\n e o produto da idade do homem mais novo com a mulher mais velha é de: " + getCalculaProduto()
				+ "\n Homem: mais velho: " + getCalculaIdadeMaiorHomem() + "\n Homem mais novo: "
				+ getCalculaMenorIdadeHomem() + "\n Mulher mais velha: " + getCalculaIdadeMaiorMulher()
				+ "\n Mulher mais nova: " + getCalculaMenorIdadeMulher();
	}
}

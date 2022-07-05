package desafio.logica.sci;

/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoQuatro {
//	centavos cada, totalizando de R$ 7,85. 4) Sabendo que há 60 segundos em um minuto, 3.600 segundos em
//	uma hora e 86.400 segundo em um dia, crie um algoritmo que a partir
//	de uma determinada quantidade de segundos fornecida pelo usuário, converte-a da seguinte maneira: • Se a quantidade de segundos for maior ou igual a 60, o programa
//	deverá exibir o número de minutos equivalente; • Se a quantidade de segundos for maior ou igual a 3.600, o
//	programa deverá exibir o número de horas equivalente;

	private int qtdSegundos;
	private int minutos, horas, dias = 0;

	public int getQtdSegundos() {
		return qtdSegundos;
	}

	public void setQtdSegundos(int qtdSegundos) {
		this.qtdSegundos = qtdSegundos;
	}

	public int calculaSegundos() {
		if (getQtdSegundos() >= 60) {
			minutos = getQtdSegundos() / 60;
			return minutos;
		}
		if (getQtdSegundos() >= 3600) {
			horas = getQtdSegundos() / 3600;
			return horas;
		}
		if (getQtdSegundos() >= 86400) {
			dias = (getQtdSegundos()%86400);
			return dias;
		}

		return 0;
	}

	public String toString() {
		if (getQtdSegundos() >= 60) {
			return getQtdSegundos() + "Segundos convertidos em " + calculaSegundos() + " minutos";
		}
		if (getQtdSegundos() >= 3600) {
			return getQtdSegundos() + "Segundos convertidos em " + calculaSegundos() + " horas";
		}
		if (getQtdSegundos() >= 86400) {
			return getQtdSegundos() + "Segundos convertidos em " + calculaSegundos() + " dias";
		}

		return null;
	}
}

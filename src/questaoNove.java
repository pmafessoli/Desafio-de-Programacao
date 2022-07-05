package desafio.logica.sci;
/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class questaoNove {
	int indice[] = new int[12];

	public void addIndicePluvioMetrico(int mes, int qtd) {
		if (mes >= indice.length)
			return;
		indice[mes] = qtd;

	}

	public float calculaMedia() {
		return somaTotal() / indice.length;
	}

	public float somaTotal() {
		float valorTotal = 0;
		for (int i = 0; i < indice.length; i++) {
			valorTotal += indice[i];

		}

		return valorTotal;
	}

	public int mesMaisChuva() {

		int mesMaisChuva = 0;
		for (int i = 0; i < indice.length; i++) {
			if (indice[i] > mesMaisChuva) {
				mesMaisChuva = i;
			}

		}
		return mesMaisChuva;
	}
	
	public int mesMenosChuva() {
		int mesMenosChuva = 0;
		for (int i = 0; i < indice.length; i++) {
			if (indice[i] < mesMenosChuva) {
				mesMenosChuva = i;
			}

		}
		return mesMenosChuva;
	}
	
	public String toString() {
		
		return "O valor total dos índices é" + somaTotal() +
				"\n a média foi de " + calculaMedia() +
				"\n O mês com mais chuva foi " + mesMaisChuva() + " com o valor pluvioMetrico " + indice[mesMaisChuva()] +
				"\n O mês com menos chuva foi " + mesMenosChuva() +  " com o valor pluvioMetrico " + indice[mesMenosChuva()];
				
	}
}

//	Arrays.stream(nums).reduce(0, (n1,n2)-> n1+n2);

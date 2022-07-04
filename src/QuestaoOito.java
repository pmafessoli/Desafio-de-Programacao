package desafio.logica.sci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuestaoOito {

	private float valorCambio;

	public float getValorCambio() {
		return valorCambio;
	}

	public void setValorCambio(float valorCambio) {
		this.valorCambio = valorCambio;
	}

	private ArrayList<Integer> listaMoedas = new ArrayList<>(List.of(1, 5, 25, 50));
	private HashMap<Integer, Integer> qtdMoedas = new HashMap<>();

	public ArrayList<Integer> getListaMoedas() {
		return listaMoedas;
	}

	public void setQtdMoedas(HashMap<Integer, Integer> qtdMoedas) {
		this.qtdMoedas = qtdMoedas;
	}

	public void addQtdMoeda(int qtdMoeda, int valorMoeda) {
		qtdMoedas.put(valorMoeda, qtdMoeda);

	}

	public int getCalcularCambio() {
		float valorTotal = 0f;
		for (Integer m : listaMoedas) {
			int qtd = qtdMoedas.get(m);
			valorTotal += m / 100.0f * qtd;
		}
		return (int) valorTotal;
	}
	
	public String toString() {
		if(getCalcularCambio() >= getValorCambio()) {
			return "Parabéns, você consegue trocar suas moedas!";
		}
		return "Infelizmente não foi possível trocar suas moedas!";
	}
}

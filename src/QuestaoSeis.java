package desafio.logica.sci;
/**
 * @author Pablo Mafessoli
 */
import java.util.ArrayList;

public class QuestaoSeis {
	private float valorProduto;
	private float valorAtual = 0;
	private ArrayList<Float> semana = new ArrayList<>();

	public float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public ArrayList<Float> getCalculoSemana() {

		for (int i = 0; i <= 5; i++) {
			valorProduto = valorProduto * 0.95f;
			semana.add(valorProduto);
		}

		return semana;

	}

	public String toString() {
		return "Valor durante as semanas " +  getCalculoSemana().toString();
	}
}

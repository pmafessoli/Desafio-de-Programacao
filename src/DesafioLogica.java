package desafio.logica.sci;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author Pablo Mafessoli Classe main para o desafio de lógica
 */
public class DesafioLogica {
	public static void main(String[] args) {

		// A classe recebe o valor da questão e assim segue com as novas entradas de dados no sistema.

		String entrada = JOptionPane.showInputDialog("Informe o número da questão: ");
		int converteEntrada = Integer.parseInt(entrada);
		if (converteEntrada <= 0 || converteEntrada > 10) {
			JOptionPane.showMessageDialog(null, "Número não encontradao", "Erro", JOptionPane.ERROR_MESSAGE);
		} else if (converteEntrada == 1) {
			String consumo = JOptionPane.showInputDialog("Informe a quantidade de biscoito consumido: ");
			int consumoConvertido = Integer.parseInt(consumo);

			QuestaoUm q1 = new QuestaoUm();
			q1.setBiscoito(consumoConvertido);
			JOptionPane.showMessageDialog(null, "Calorias consumidas: " + q1.calcularCaloria());

		} else if (converteEntrada == 2) {
			String homens = JOptionPane.showInputDialog("Número de homens matriculados: ");
			int homensMatriculados = Integer.parseInt(homens);
			String mulheres = JOptionPane.showInputDialog("Número de mulheres matriculadas: ");
			int mulheresMatriculadas = Integer.parseInt(mulheres);

			QuestaoDois q2 = new QuestaoDois();
			q2.setHomens(homensMatriculados);
			q2.setMulheres(mulheresMatriculadas);
			JOptionPane.showMessageDialog(null, q2.toString());

		} else if (converteEntrada == 3) {
			String ovos = JOptionPane.showInputDialog("Informe a quantidade de ovos comprados: ");
			int ovosConvertidos = Integer.parseInt(ovos);
			QuestaoTres q3 = new QuestaoTres();
			q3.setQtdOvos(ovosConvertidos);
			JOptionPane.showMessageDialog(null, q3.toString());

		} else if (converteEntrada == 4) {
			String segundos = JOptionPane.showInputDialog("Informe a quantidade de segundos: ");
			int segundosConvertido = Integer.parseInt(segundos);
			
			QuestaoQuatro q4 = new QuestaoQuatro();
			q4.setQtdSegundos(segundosConvertido);
			
			JOptionPane.showMessageDialog(null, q4.toString());
			
		} else if (converteEntrada == 5) {
			String salario = JOptionPane.showInputDialog("Informe o seu salário atual:  ");
			float salarioConvertido = Float.parseFloat(salario);
			String cargoAtual = JOptionPane.showInputDialog("Informe o seu cargo atual:  ");

			QuestaoCinco q5 = new QuestaoCinco();
			q5.setCargo(cargoAtual);
			q5.setSalario(salarioConvertido);
			JOptionPane.showMessageDialog(null, q5.toString());
		} else if (converteEntrada == 6) {
			String valor = JOptionPane.showInputDialog("Informe o valor do produto: ");
			int valorConvertido = Integer.parseInt(valor);
			QuestaoSeis q6 = new QuestaoSeis();
			q6.setValorProduto(valorConvertido);
			JOptionPane.showMessageDialog(null, q6.toString());

		}

		else if (converteEntrada == 7) {
			String idadeHomemUm = JOptionPane.showInputDialog("Informe a idade do primeiro homem:  ");
			int idadeHomemUmConvertido = Integer.parseInt(idadeHomemUm);

			String idadeHomemDois = JOptionPane.showInputDialog("Informe a idade do segundo homem:  ");
			int idadeHomemDoisConvertido = Integer.parseInt(idadeHomemDois);

			String idadeMulherUm = JOptionPane.showInputDialog("Informe a idade da primeira mulher  ");
			int idadeMulherUmConvertido = Integer.parseInt(idadeMulherUm);

			String idadeMulherDois = JOptionPane.showInputDialog("Informe a idade da segunda mulher  ");
			int idadeMulherDoisConvertido = Integer.parseInt(idadeMulherDois);

			QuestaoSete q7 = new QuestaoSete();
			q7.setHomemUm(idadeHomemUmConvertido);
			q7.setHomemDois(idadeHomemDoisConvertido);
			q7.setMulherUm(idadeMulherUmConvertido);
			q7.setMulherDois(idadeMulherDoisConvertido);
			JOptionPane.showMessageDialog(null, q7.toString());
		} else if (converteEntrada == 8) {
			QuestaoOito q8 = new QuestaoOito();
			String cotacao = JOptionPane.showInputDialog("Informe a cotação do dólar: ");
			float cotacaoConvertido = Float.parseFloat(cotacao);
			q8.setValorCambio(cotacaoConvertido);

			String novasMoedas;

			do {
				
				for (int moeda : q8.getListaMoedas()) {
					String qtdMoedas = JOptionPane.showInputDialog("Informe a quantidade de moedas de " + moeda + ": ");
					int qtMoedasConvertido = Integer.parseInt(qtdMoedas);
					q8.addQtdMoeda(moeda, qtMoedasConvertido);
				}

				novasMoedas = JOptionPane.showInputDialog("Deseja Informar moedas novamente? ");
			} while (novasMoedas.equalsIgnoreCase("sim"));

			JOptionPane.showMessageDialog(null, q8.toString());

		} else if (converteEntrada == 9) {
			questaoNove q9 = new questaoNove();
			for (int i = 0; i <= 11; i++) {
				String indice = JOptionPane.showInputDialog("Informe o valor do indice  ");
				int valorIndice = Integer.parseInt(indice);
				q9.addIndicePluvioMetrico(i, valorIndice);
			}

			JOptionPane.showMessageDialog(null, q9.toString());
		}
	}
}

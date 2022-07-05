package desafio.logica.sci;
/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoCinco {

//	5) Uma empresa concederá um aumento de salário aos seus
//	funcionários, variável de acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo que leia o salário e o cargo de um funcionário e
//	calcule o novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o
//	novo salário e a diferença.

	private float salario;
	private String cargo;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getNovoSalario() {
		float salarioNovo = 0;
		if (getCargo().equalsIgnoreCase("Gerente")) {
			salarioNovo += getSalario() * 0.1f + getSalario();
			return salarioNovo;
		} else if (getCargo().equalsIgnoreCase("Engenheiro")) {
			salarioNovo += getSalario() * 0.2f + getSalario();
			return salarioNovo;
		} else if (getCargo().equalsIgnoreCase("Técnico")) {
			salarioNovo += getSalario() * 0.3f + getSalario();
			return salarioNovo;
		} 
		
		return salarioNovo + getSalario() * 0.4f + getSalario();
	}

	public float getCalculaDiferenca() {
		float salarioAntigo = getNovoSalario() - getSalario();
		return salarioAntigo;
	}

	public String toString() {
		return "Seu salário atual é de R$" + getSalario() + "seu novo salário é de R$" + getNovoSalario()
				+ " seu aumento foi de R$" + getCalculaDiferenca();
	}

}

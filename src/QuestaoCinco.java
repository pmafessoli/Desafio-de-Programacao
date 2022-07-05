package desafio.logica.sci;
/**
 * 
 * @author Pablo Mafessoli
 *
 */
public class QuestaoCinco {

//	5) Uma empresa conceder� um aumento de sal�rio aos seus
//	funcion�rios, vari�vel de acordo com o cargo, conforme a tabela abaixo. Fa�a um algoritmo que leia o sal�rio e o cargo de um funcion�rio e
//	calcule o novo sal�rio. Se o cargo do funcion�rio n�o estiver na tabela, ele dever�, ent�o, receber 40% de aumento. Mostre o sal�rio antigo, o
//	novo sal�rio e a diferen�a.

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
		} else if (getCargo().equalsIgnoreCase("T�cnico")) {
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
		return "Seu sal�rio atual � de R$" + getSalario() + "seu novo sal�rio � de R$" + getNovoSalario()
				+ " seu aumento foi de R$" + getCalculaDiferenca();
	}

}

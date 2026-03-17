package Classes;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
	    return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double porcentagem) {
		this.salarioBruto += (salarioBruto*porcentagem / 100);
	}
	
	public String toString() {
		return "Dados do funcionário: \n"
			+ "Nome: " + nome + "\n"
			+ "Salário Líquido: " + salarioLiquido() + "\n";
	}
		
}

package Classes;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3, media, pontosFaltantes;
	
	public double calcularMedia() {
		return media = nota1 + nota2 + nota3;
	}
	
	
	public String toString() {
		if (calcularMedia() >= 60) {
			return "- Nome: " + nome + "\n"
				 + "- Média: " + calcularMedia() + "\n"
				 + "- Situação: Aprovado(a)" + "\n";
		}
		else {
			pontosFaltantes = 60 - calcularMedia();
			return "- Nome: " + nome + "\n"
				 + "- Média: " + calcularMedia() + "\n"
				 + "- Situação: Reprovado(a)\n"
				 + "- Faltam " + pontosFaltantes + " pontos para a aprovação\n";
			
		}		
	}
	

}

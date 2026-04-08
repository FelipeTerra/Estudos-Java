import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//Para fazer impressões em tela usando o println e concatenar com variáveis, deve utilizar os seguintes operadores:
		//%f para ponto flutuante podendo definir quantas casas serão depois da vírgula, ex: (%.3f%n) que neste caso terá como resultado um número com 3 casas depois da vírgula.
		//%d para inteiros
		//%s para strings
		//%n para quebra de linha
		
		System.out.printf("Products:");
		System.out.println();
		System.out.printf("%s, wich price is $ %.2f%n",product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n",product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places) : %.3f%n", measure);
		Locale.setDefault(Locale.US); // serve para mudar o tipo de impressão de números com casas decimais. Neste caso este comando localiza e seta o padrão americano de numecação para casas decimais.
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}

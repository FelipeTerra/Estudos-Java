package entites;

public class rectangle {
	public double altura, largura;
	
	public double area() {
		return altura*largura;
	}
	
	public double perimetro() {
		return 2*(altura + largura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura*altura + largura*largura);
	}
	
	public String toString() {
	    return String.format(
	        "Resultados:%n- Área: %.2f%n- Perímetro: %.2f%n- Diagonal: %.2f",
	        area(), perimetro(), diagonal()
	    );
	}
	

}


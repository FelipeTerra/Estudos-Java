package Entities;

public class Contribuintes {
    private String nome;
    private Double rendaAnual;

    public Contribuintes(){}

    public Contribuintes(String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome(){return nome;}

    public void setNome(String nome){ this.nome = nome; }

    public Double getRendaAnual(){return rendaAnual;}

    public void setRendaAnual(Double rendaAnual){ this.rendaAnual = rendaAnual;}

    public Double calcularTotalArrecadado(){
        Double total = 0.0;
        return total;
    }
}

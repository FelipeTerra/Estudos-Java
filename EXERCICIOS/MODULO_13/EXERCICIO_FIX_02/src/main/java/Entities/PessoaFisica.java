package Entities;

public class PessoaFisica extends Contribuintes{
    public Double gastosComSaude;

    public PessoaFisica(){ super();}

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude){
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calcularImposto(){
        Double totalImpostoPf = 0.0;
        if (getRendaAnual() < 20000){
            return totalImpostoPf = (getRendaAnual() * 0.15) - (gastosComSaude * 0.50);
        }
        else {
            return totalImpostoPf = (getRendaAnual() * 0.25) - (gastosComSaude * 0.50);
        }
    }
}

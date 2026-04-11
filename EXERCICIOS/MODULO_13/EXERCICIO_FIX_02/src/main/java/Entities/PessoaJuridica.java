package Entities;

public class PessoaJuridica extends Contribuintes{
    private Integer qtdFuncionarios;

    public PessoaJuridica(){ super(); }

    public PessoaJuridica( String nome, Double rendaAnual, Integer qtdFuncionarios){
        super (nome, rendaAnual);
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public Integer getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(Integer qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    @Override
    public Double calcularImposto() {
        Double totalImpostoPj = 0.0;
        if(qtdFuncionarios < 10) {
           return totalImpostoPj = getRendaAnual() * 0.16;
        }
        else {
            return totalImpostoPj = getRendaAnual() * 0.14;
        }
    }
}

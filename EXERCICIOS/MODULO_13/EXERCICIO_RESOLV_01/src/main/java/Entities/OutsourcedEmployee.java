package Entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalChrge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalChrge) {
        super(name, hour, valuePerHour);
        this.additionalChrge = additionalChrge;
    }

    public Double getAdditionalChrge() {
        return additionalChrge;
    }

    public void setAdditionalChrge(Double additionalChrge) {
        this.additionalChrge = additionalChrge;
    }

    //sobreescrevendo o metodo payment() da classe pai.
    @Override
    public Double payment(){
        return super.payment() + additionalChrge * 1.1;
    }
}

package Entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() { return customsFee; }

    public void setCustomsFee(Double customsFee) { this.customsFee = customsFee; }

    public Double totalPrice() {
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(" | Product: ").append(super.getName());
        sb.append(" | Price: $ ").append(String.format("%.2f", totalPrice()))
                .append(" (Custons fee: $ ").append(String.format("%.2f", customsFee)).append(")");
        sb.append("\n");
        return sb.toString();
    }
}

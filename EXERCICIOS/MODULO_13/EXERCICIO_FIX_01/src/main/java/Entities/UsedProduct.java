package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() { return manufactureDate; }

    public void setManufactureDate(Date manufactureDate) { this.manufactureDate = manufactureDate; }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(" | Product: ").append(super.getName()).append(" (Used) ");
        sb.append(" | Price: ").append(getPrice());
        sb.append(" (Manufacture Date: ").append(sdf.format(getManufactureDate())).append(")").append("\n");
        return sb.toString();
    }


}

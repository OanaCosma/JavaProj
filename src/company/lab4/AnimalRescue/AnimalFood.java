package company.lab4.AnimalRescue;

public class AnimalFood {
    private String name;
    private int priceDollar;
    private int quantityKg;
    private String stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceDollar() {
        return priceDollar;
    }

    public void setPriceDollar(int PriceDollar) {
        this.priceDollar = PriceDollar;
    }

    public int getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(int QuantityKg) {
        this.quantityKg = QuantityKg;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String Stock) {
        this.stock = Stock;
    }
}
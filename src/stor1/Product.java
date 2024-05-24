package stor1;

public class Product implements Access {

    String item;
    int manufactuarerDate;
    int expirationDate;
    double price;
    int Quantity;

    // parameterized constructor
    public Product(int manufactuarerDate, int expirationDate) {
        this.manufactuarerDate = manufactuarerDate;
        this.expirationDate = expirationDate;
    }
    
   // setter & getter
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getManufactuarerDate() {
        return manufactuarerDate;
    }

    public void setManufactuarerDate(int manufactuarerDate) {
        this.manufactuarerDate = manufactuarerDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    // implements from interface
    @Override
    public void Adding() {
    }

    @Override
    public void Removing() {
    }

}

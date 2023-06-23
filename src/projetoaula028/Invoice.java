// @author RA21600867
package projetoaula028;
public class Invoice implements Payable {
    private String partNumber, partDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice(String part, String description, int count, double price) {
        partNumber = part;
        partDescription = description;
        setQuantity(count);
        setPricePerItem(price);
    }
    public void setPartNumber(String part) {
        partNumber = part;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartDescription(String description) {
        partDescription = description;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setQuantity(int count) {
        quantity = (count < 0)? 0: count;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPricePerItem(double price) {
        pricePerItem = (price < 0.0)? 0.0: price;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
    @Override
    public String toString() {
        return String.format("%s: %s (%s)\n%s: %d\n%s: R$ %,.2f\n", "part number", getPartNumber(), getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
    }
}
public class Land extends RealProperty {
    private String purpose;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Land(String cadastralNumber, Address property, double price, Person owner, double area, String purpose) {
        super(cadastralNumber, property, price, owner, area);
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Land{" + "cadastralNumber='" + getCadastralNumber() + '\'' +
                ", address=" + property +
                ", price=" + getPrice() +
                ", purpose='" + purpose + '\'' +
                ", area=" + getArea() +
                ", owner=" + owner +
                '}';
    }

    @Override
    public double getPropertyTax() {
        return super.getPropertyTax();
    }
}

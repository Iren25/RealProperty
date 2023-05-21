public abstract class RealProperty {
    private String cadastralNumber;
    Address property;
    private double price;
    Person owner;
    private double area;

    public Address getProperty() {
        return property;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public RealProperty(String cadastralNumber, Address property, double price, Person owner, double area) {
        this.cadastralNumber = cadastralNumber;
        this.property = property;
        this.price = price;
        this.owner = owner;
        this.area = area;
    }

    @Override
    public String toString() {
        return "RealProperty{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", address=" + property +
                ", price=" + price +
                ", owner=" + owner +
                ", area=" + area +
                '}';
    }
    public double getPropertyTax(){
        return (getPrice()/100)*0.1;
    }
}

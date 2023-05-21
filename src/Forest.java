public class Forest extends RealProperty {

    public boolean isProtectedZone;

    public Forest(String cadastralNumber, Address property, double price, Person owner, double area, boolean isProtectedZone) {
        super(cadastralNumber, property, price, owner, area);
        this.isProtectedZone = isProtectedZone;
    }

    @Override
    public String toString() {
        return "Forest{" + "cadastralNumber='" + getCadastralNumber() + '\'' +
                ", address=" + property +
                ", price=" + getPrice() +  ", area=" + getArea() +
                ", owner=" + owner +
                "isProtectedZone=" + isProtectedZone +
                '}';
    }

    @Override
    public double getPropertyTax() {
        return super.getPropertyTax();
    }
}

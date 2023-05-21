public class Garage extends RealProperty {
    private int numberOfParkingSpaces;

    public int getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    public void setNumberOfParkingSpaces(int numberOfParkingSpaces) {
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    public Garage(String cadastralNumber, Address property, double price, Person owner, double area, int numberOfParkingSpaces) {
        super(cadastralNumber, property, price, owner, area);
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    @Override
    public String toString() {
        return "Garage{" + " cadastralNumber='" + getCadastralNumber() + '\'' +
                ", address=" + property +
                ", price=" + getPrice() +  ", area=" + getArea() +
                ", owner=" + owner +
                "numberOfParkingSpaces=" + numberOfParkingSpaces +
                '}';
    }

    @Override
    public double getPropertyTax() {
        return super.getPropertyTax();
    }
}

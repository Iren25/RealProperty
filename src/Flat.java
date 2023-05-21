import java.util.ArrayList;

public class Flat extends RealProperty {
    private ArrayList<Person>tenants;
    private int numberOfRooms;

    public ArrayList<Person> getTenants() {
        return tenants;
    }

    public void setTenants(ArrayList<Person> tenants) {
        this.tenants = tenants;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Flat(String cadastralNumber, Address property, double price, Person owner, double area, ArrayList<Person>tenants, int numberOfRooms) {
        super(cadastralNumber, property, price, owner, area);
        this.tenants = tenants;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "Flat{" + " cadastralNumber='" + getCadastralNumber() + '\'' +
                ", address=" + property +
                ", price=" + getPrice() +  ", area=" + getArea() +
                ", owner=" + owner +
                "tenants=" + tenants +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }

    @Override
    public double getPropertyTax() {
        return super.getPropertyTax();
    }
}

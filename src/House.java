import java.util.ArrayList;

public class House extends RealProperty{
    private ArrayList<Person> tenants;
    private int numberOfFloors;

    public ArrayList<Person> getTenants() {
        return tenants;
    }

    public void setTenants(ArrayList<Person> tenants) {
        this.tenants = tenants;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public House(String cadastralNumber, Address property, double price, Person owner, double area, ArrayList<Person>tenants, int numberOfFloors) {
        super(cadastralNumber, property, price, owner, area);
        this.tenants = tenants;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + " cadastralNumber='" + getCadastralNumber() + '\'' +
                ", address=" + property +
                ", price=" + getPrice() +  ", area=" + getArea() +
                ", owner=" + owner +
                " tenants=" + tenants +
                ", floors=" + numberOfFloors +
                '}';
    }

    @Override
    public double getPropertyTax() {
        return super.getPropertyTax();
    }
}

public class Address {
    private String town;
    private String street;
    private String numberOfHouse;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(String numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public Address(String town, String street, String numberOfHouse) {
        this.town = town;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse='" + numberOfHouse + '\'' +
                '}';
    }

    public int compareTo(Address property) {
        return 0;
    }
}

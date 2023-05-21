import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Nikolay", "Belov", "AFS4786SL3");
        Person farmer = new Person("Gans", "Mühller", "ND28563RV24");
        Person ownerOfHouse = new Person("Wassily", "Kandinsky", "TR09453NM22");
        Person ownerOfFlat = new Person("Ekaterina", "Shulman", "KP0927MN00");
        Person ownerOfGarage = new Person("Sebastian", "Fettel", "DE60973GF00");
        ArrayList<Person> tenantsOfHouse = new ArrayList<>();
        tenantsOfHouse.add(new Person("Frida", "Kahlo", "QJX284MD53"));
        tenantsOfHouse.add(new Person("Kazimir", "Malevich", "RT3610K84"));
        tenantsOfHouse.add(new Person("Marc", "Chagall", "HK1725E970"));
        tenantsOfHouse.add(new Person("Claude", "Monet", "WD0948HD008"));
        tenantsOfHouse.add(new Person("Natalia", "Goncharova", "RD07516HP440"));
        ArrayList<Person> tenantsOfFlat = new ArrayList<>();
        tenantsOfFlat.add(new Person("Maxim", "Katz", "DS103852VZ00"));
        tenantsOfFlat.add(new Person("Ilya", "Varlamov", "FB994927S01"));
        tenantsOfFlat.add(new Person("Yury", "Dud", "ED109628CC08"));

        Land land = new Land("2742 3043 394 3300", (new Address("Vienna", "Schönbrunngasse", "15A")), 560000, person, 6.8, "земли населенных пунктов");
        System.out.println(land);
        System.out.println(land.getPropertyTax());
        Forest forest = new Forest("59829 8484 0174 9294", (new Address("Schwarzwald", "--", "--")),1678932, farmer, 378, true);
        System.out.println(forest);
        System.out.println(forest.getPropertyTax());
        House artsHouse = new House("2632 0098 0000 6540", (new Address("Salzburg", "Schwarzstrasse", "78")), 800000, ownerOfHouse, 300,
                tenantsOfHouse, 3);
        System.out.println(artsHouse);
        System.out.println(artsHouse.getPropertyTax());
        Flat journalistsFlat = new Flat("5006 4938 0000 3809 100", (new Address("Berlin", "Richard-Wagner Strasse", "13A")), 479000, ownerOfFlat,
                98, tenantsOfFlat, 4);
        System.out.println(journalistsFlat);
        System.out.println(journalistsFlat.getPropertyTax());
        Garage racingGarage = new Garage("6900 0007 9500 4001", (new Address("Heppenheim", "Merianstrasse", "46")), 20000, ownerOfGarage,
                100, 5);
        System.out.println(racingGarage);
        System.out.println(racingGarage.getPropertyTax());

        ArrayList<RealProperty> realProperties = new ArrayList<>();
        realProperties.add(land);
        realProperties.add(forest);
        realProperties.add(artsHouse);
        realProperties.add(journalistsFlat);
        realProperties.add(racingGarage);
        System.out.println(realProperties);
        getSortedByPrice(realProperties);
        getSortedByTaxes(realProperties);
        getSortedByArea(realProperties);
        getSortByAddress(realProperties);


    }
    public static void getSortedByPrice(ArrayList<RealProperty>list){
        list.sort(new RealPropertyByPriceComparator());
        System.out.println(list);
    }
    public static void getSortedByTaxes(ArrayList<RealProperty>list){
        list.sort(new RealPropertyByTaxesComparator());
        System.out.println(list);
    }
    public static void getSortedByArea(ArrayList<RealProperty>list){
        list.sort(new RealPropertyByArea());
        System.out.println(list);
    }
    public static void getSortByAddress(ArrayList<RealProperty>list){
        list.sort(new RealPropertyByAddressComparator());
        System.out.println(list);
    }
}
public class VillageHouse extends House{


    public VillageHouse(String id, String name, String address, int price, int year, Person[] people) {
        super(id, name, address, price, year, people);
    }

    @Override
    public void city() {
        System.out.println( getAddress()+" кочосундо жашашат");
    }

    @Override
    public void electricity() {
        System.out.println("5 адам электричествого толойт");

    }
}

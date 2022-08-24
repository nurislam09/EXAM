import java.util.Scanner;

public abstract class House {
    private String id;
    private String name;
    private String address;
    private int price;
    private int year;
    private Person [] people ;
    Scanner scanner = new Scanner(System.in);

    public abstract void city();
    public abstract void electricity();
    public Person[] peoples  = new Person[5];
    private int indexOfpeople = 0;

    public House(String id, String name, String address, int price, int year, Person[] people) {

        if (name.startsWith("r")||name.startsWith("o")||name.startsWith("b")||
                name.startsWith("m")||name.startsWith("v")||name.startsWith("h")){
            this.name = name;
        }else {
            System.out.println("Error");
            System.out.println("Please try again");
            while (!(name.startsWith("r")||name.startsWith("o")||name.startsWith("b")||
                    name.startsWith("m")||name.startsWith("v")||name.startsWith("h"))){
                name=scanner.nextLine();
            }
        }


        if (price>70000){
            this.price = price;
        }else {
            System.out.println("Error");
            System.out.println("Please try again");
            while (!(price>70000)){
                price=scanner.nextInt();
            }
        }

        if (year>2015){
            this.year = year;

        }else {
            System.out.println("Error");
            System.out.println("Please try again");
            while (!(year>2015)){
                year=scanner.nextInt();
            }
        }
        this.id = id;
        this.address = address;
        this.people = people;
    }


    public  void addPerson(Person person){
        people[indexOfpeople] = person;
        indexOfpeople++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
}


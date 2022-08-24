import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       // Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("112","Nurislam","Ysmailov","XXXXXXXX@gmail.com",
                23,"+996 708 690 343");
        Person person2 = new Person("211","Madina","Ysmailov","XXXXXXXX@gmail.com",
                24,"+996 708 690 343");
        Person person3 = new Person("789","Samarbek","Ysmailov","XXXXXXXX@gmail.com"
                ,25,"+996 708 690 343");
        Person person4 = new Person("348","Uluk","Ysmailov","XXXXXXXX@gmail.com",
                26,"+996 708 690 343");
        Person person5 = new Person("097","Sultan","Ysmailov","XXXXXXXX@gmail.com",
                27,"+996 708 690 343");
        Person person6 = new Person("443","Ahmed","Ysmailov","XXXXXXXX@gmail.com",
                28,"+996 708 690 343");
        Person person7 = new Person("678","Bermet","Ysmailov","XXXXXXXX@gmail.com",
                23,"+996 708 690 343");
        Person person8 = new Person("932","Aliya","Ysmailov","XXXXXXXX@gmail.com",
                24,"+996 708 690 343");
        Person person9 = new Person("535","Nursultan","Ysmailov","XXXXXXXX@gmail.com",
                21,"+996 708 690 343");
        Person person10 = new Person("254","Burulay","Ysmailov","XXXXXXXX@gmail.com",18,
                "+996 708 690 343");

        VillageHouse villageHouse=new VillageHouse("4598","rapris","Гражданская",80000,
                2018,new Person[5]);
        BestHouse bestHouse = new BestHouse("4609","ramas","Жибек жолу",
                1000000,2022,new Person[5]);
         Person [] people={person1,person2,person3,person4,person5,person6,person7,person8,person9,person10};
         House [] houses={villageHouse,bestHouse};

        System.out.println("VILLAGE HOUSE");
        System.out.println("ID: "+villageHouse.getId());
        System.out.println("Name of House: "+villageHouse.getName());
        System.out.println("Address: "+villageHouse.getAddress());
        System.out.println("Price: "+villageHouse.getPrice()+"$");
        System.out.println("Year: "+villageHouse.getYear());
        for (int i = 0;i < 5; i++) {
            villageHouse.addPerson(people[i]);
            System.out.print(people[i].getName()+",");
        }
        System.out.println();
        villageHouse.city();
        villageHouse.electricity();
        for (Person i:villageHouse.getPeople()) {
            i.work("Пракуратура");
            i.timetable(2,3);

        }
//        person1.timetable(2,3);
//        person2.timetable(2,3);
//        person3.timetable(2,3);
//        person4.timetable(2,3);
//        person5.timetable(2,3);

        System.out.println("--------------------------------");

        System.out.println("BEST HOUSE");
        System.out.println("ID: "+bestHouse.getId());
        System.out.println("Name of House: "+bestHouse.getName());
        System.out.println("Address: "+bestHouse.getAddress());
        System.out.println("Price: "+bestHouse.getPrice()+"$");
        System.out.println("Year: "+bestHouse.getYear());
        for (int i = 5; i < 10 ; i++) {
            bestHouse.addPerson(people[i]);
            System.out.print(people[i].getName()+",");
        }
        System.out.println();
        bestHouse.city();
        bestHouse.electricity();
        for (Person i: bestHouse.getPeople()) {
            i.work("Пракуратура");
            i.timetable(2,3);

        }
//        person6.timetable(2,3);
//        person7.timetable(2,3);
//        person8.timetable(2,3);
//        person9.timetable(2,3);
//        person10.timetable(3,6);

    }
}
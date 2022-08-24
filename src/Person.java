import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private  String phoneNumber;
    Scanner scanner = new Scanner(System.in);

    public Person(String id, String name, String surname, String email, int age, String phoneNumber) {
        this.id = id;
        if (age>0&&age<=110){
            this.name = name;
        }else {
            System.out.println("Терс сан берууго жана жок жаш берууго болбойт");
            while (!(age>0&&age<=110)){
                age=scanner.nextInt();
            }
        }

        if (email.endsWith("@gmail.com")){
            this.email = email;
        }
        else{
            System.out.println("Жок кайрадан текшериниз");
            while (!(email.contains("@"))){
                email=scanner.nextLine();
            }
        }

        if(phoneNumber.startsWith("+996")){
            this.phoneNumber = phoneNumber;
        }else {
            System.out.println("Кыргыз номер беринриз");
            while (!(phoneNumber.startsWith("+996"))){
                phoneNumber=scanner.nextLine();
            }
        }

        this.surname = surname;
        this.age = age;

    }
    public void work(String work){
        System.out.println(name + work  +"да"+" иштейт");

    }
    public void timetable(int days,int hours){
        System.out.println(name +" жумасына "+ days+"кун "+hours+ "саат иштейт ");
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

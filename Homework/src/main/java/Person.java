public class Person {

    String name;
    String surname;
    int yearOfBirth;

    public static void main(String[] args) {
        Person a = new Person();

        a.name = "James";
        a.surname = "Gosling";
        a.yearOfBirth = 1955;

        System.out.println("Name: " + a.name);
        System.out.println("Surname: " + a.surname);
        System.out.println("Year of birth: " + a.yearOfBirth);

    }
}


public class Human {
    private String Name;
    private String Surname;
    private int age;

    static int year = 2022;

    public Human(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void Show(Human pepole){
        System.out.println("Name is " + pepole.getName() + " Surname is " + pepole.getSurname() + " Age is "+ (year - pepole.getAge()));
    }
}

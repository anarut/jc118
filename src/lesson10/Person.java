package lesson10;

public class Person {

    private String name;
    private int age;
    private boolean male;

    public Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        if (name == null || name.trim().equals("")) {
//            System.out.println("error");
//        } else {
//            this.name = name;
//        }
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        if (age <= 0) {
//            System.out.println("error");
//        } else {
//            this.age = age;
//        }
//    }

    public boolean isMale() {
        return male;
    }

//    public void setMale(boolean male) {
//        this.male = male;
//    }
}

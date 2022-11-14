package lesson17;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {

    public static final long serialVersionUID = 1L;

    public static double PI = Math.PI;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Double weight;
    private Integer height;
    private Boolean male;
    private transient String password;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate birthDate, Double weight, Integer height, Boolean male) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
        this.male = male;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new RuntimeException("too small");
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                ", height=" + height +
                ", male=" + male +
                ", password='" + password + '\'' +
                '}';
    }
}

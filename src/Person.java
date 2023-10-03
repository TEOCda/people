import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return address != null && !address.isEmpty();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String sAddress) {
        address = sAddress;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                "\n Фамилия: " + surname +
                "\n Возраст: " + age +
                "\n Город проживания: " + address + ";";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setName(this.name)
                .setSurname(getSurname())
                .setAge(this.age)
                .setAddress(getAddress());
    }
}

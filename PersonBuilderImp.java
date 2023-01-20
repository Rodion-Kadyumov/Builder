public class PersonBuilderImp implements PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;
    Person person;

    @Override
    public Person build() throws IllegalStateException {
        if (name != null && surname != null) {
            person = new Person(name, surname, age);
        } else {
            throw new IllegalStateException("Недостаточно данных: отсутствует имя или фамилия.");
        }

        return person;
    }

    @Override
    public PersonBuilderImp setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilderImp setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilderImp setAge(int age) throws IllegalArgumentException {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Неверное значение возраста.");
        }
        return this;
    }

    @Override
    public PersonBuilderImp setAddress(String address) {
        this.address = address;
        return this;
    }
}
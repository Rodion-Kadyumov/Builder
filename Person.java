public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String address; //

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilderImp newChildBuilder(int age) {
        return new PersonBuilderImp()
                .setSurname(this.surname)
                .setAddress(this.address)
                .setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return (address == null) ? "неизвестен" : address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAdress() {
        return address != null;
    }

    @Override
    public String toString() {
        String ageString = "неизвестен";
        String addressString = "неизвестен";
        if (this.hasAge()) {
            ageString = String.valueOf(age);
        }
        if (this.hasAdress()) {
            addressString = address;
        }
        return name + " " + surname + ", возраст " + ageString + ", адрес " + addressString + ".";
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + age;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        return result;
    }
}
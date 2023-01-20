public class Main {
    public static void main(String[] args) {

        Person person = new PersonBuilderImp()
                .setName("Алия")
                .setSurname("Аля")
                .setAge(19)
                .setAddress("Екатеринбург")
                .build();
        System.out.println(person);

        Person person2 = new PersonBuilderImp()
                .setName("Наталья")
                .setSurname("Фетисова")
                .setAddress("Магнитогорск")
                .build();
        System.out.println(person2);

        Person person3 = person.newChildBuilder(2)
                .setName("Саша")
                .build();

        System.out.println(person3);

        try {
            Person person4 = new PersonBuilderImp().setAge(300).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            Person person5 = new PersonBuilderImp().setAge(15).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
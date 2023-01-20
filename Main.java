public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Алина")
                .setSurname("Аля")
                .setAge(31)
                .setAddress("Канада")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Аристарх")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

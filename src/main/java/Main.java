public class Main {
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("AAA", "444");
        phoneBook.add("BBB", "999");
        System.out.println(phoneBook.findByNumber("999"));


    }
}

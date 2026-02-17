public class Main {

    public static void main(String[] args) {
        Address myAdd = new Address();

        System.out.println(myAdd);
        myAdd.setHouseNumber(69);
        myAdd.setCity("Another City");
        System.out.println(myAdd);
    }
}

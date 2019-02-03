public class NameCardTestDrive {
    public static void main(String[] args) {
        NameCard MyCard = new NameCard();
        MyCard.setName("Polly Morfism");
        MyCard.setPhone("555-0343");
        MyCard.setEmail("pm@wickedlysmart");
        System.out.println("Name: " + MyCard.getName());
        System.out.println("Phone: " + MyCard.getPhone());
        System.out.println("Email: " + MyCard.getEmail());
    }

}

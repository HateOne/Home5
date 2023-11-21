public class Main {
    public static void main(String[] args) {
        MyBonusMiles service = new MyBonusMiles();
        int price = 13_000;
        int miles = service.amount(price);
        System.out.println(miles);
    }
}
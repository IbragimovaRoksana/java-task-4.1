public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        int miles1 = service.calculate(200000);
        System.out.println(miles);
        System.out.println(miles1);
    }
}

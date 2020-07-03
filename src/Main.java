public class Main {

    static void showData(Building building)
    {
        System.out.println(building.showInitialData());
        System.out.println(building.showCalculatedData());
    }

    public static void main(String[] args) {
        Church church = new Church();
        University university = new University(1, 2, 3 ,4);
        showData(church);
        showData(university);
    }
}

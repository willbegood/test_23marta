public class SimpleDotComTest {
    static SimpleDotCom dot = new SimpleDotCom();

    public static void main(String[] args) {
        before_tests();
        Test_success();
        test_failed();
    }

    private static void before_tests() {
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

    }

    private static void test_failed() {

        String userGuess = "5";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        check("попал", result);

    }

    private static void Test_success() {

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        check("мимо", result);
    }

    private static void check(String validResult, String realResult) {

        if (validResult.equals(realResult)) {
            System.out.println("Тест не пройден");
        } else {
            System.out.println("Тест  пройден");
        }

    }
}
public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if (12 < ageOne && ageOne < 20 || 12 < ageTwo && ageTwo < 20 || 12 < ageThree && ageThree < 20) {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int age) {
        if (13 <= age && age <= 19) {
            return true;
        }
        return false;
    }
}

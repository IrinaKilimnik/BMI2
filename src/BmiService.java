public class BmiService {
    public int calculate(double height, int weight) {
        int result = (int) (weight / (height * height));
        return result;
    }
}

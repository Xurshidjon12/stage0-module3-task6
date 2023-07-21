package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundedNumber = Math.round(numberToBeRounded);
        System.out.println("Rounded number: " + roundedNumber);
    }

    public static void main(String[] args) {
        FloatTypeCasting floatTypeCasting = new FloatTypeCasting();
        float number = 12.75f;
        floatTypeCasting.roundNumber(number);
    }
}

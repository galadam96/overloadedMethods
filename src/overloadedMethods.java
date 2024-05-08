public class overloadedMethods {
    public static void main(String[] args) {
        System.out.println("50 inches is " + convertToCentimeters(50)+
                " cm");
        System.out.println("5ft 8in is "+ convertToCentimeters(5,8)+
                " cm");

    }

    public static double convertToCentimeters(int inches){
        return (inches * 2.54);

    }

    public static double convertToCentimeters(int feet,int inches){
        int heightInInches = (12 * feet) + inches;
        return convertToCentimeters(heightInInches);
    }
}

package SeleniumTestersPrograms;

public class RemoveLeadingZeroes {

    public static void main(String[] args) {
        String value = "1992";

        //remove leading zeroes
        String newValue = value.replaceFirst("^0+(?!$)", "");
        System.out.println("New value is: " + newValue);

    }



}

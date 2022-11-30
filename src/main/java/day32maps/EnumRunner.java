package day32maps;

import java.util.Arrays;

public class EnumRunner {
    //Enum icine birden fazla data koyabiliriz
    //Enum icindeki datalara getter lar sayesinde ulasilabilir
    public static void main(String[] args) {

        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abbr = UsStates.FLORIDA.getAbbrevation();
        System.out.println(abbr);

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String stateName = UsStates.getAbbreviationFromCapital("Denver");
        System.out.println(stateName);

        String abbreviations = UsStates.getAbbreviationsCapital("Atlanta");
        System.out.println(abbreviations);




    }

}

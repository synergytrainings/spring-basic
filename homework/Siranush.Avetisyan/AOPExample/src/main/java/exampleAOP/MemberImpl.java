package exampleAOP;

/**
 * Author : Siranush Avetisyan
 * Since : 16/6/2015
 */
public class MemberImpl implements Member {

    public void printSerialNumber() {
        System.out.println("Serial Number: AS-777777");
    }

    public void printName() {
        System.out.println("Name: Siranush");
    }

    public void printNationality() {
        System.out.println("Nationality: Armenian");
    }

}

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //inizializzo lo scanner//
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String firstStr = input.nextLine();
        System.out.println("Prima stringa: " + firstStr);
        String secondStr = input.nextLine();
        System.out.println("Seconda stringa: " + secondStr);
        String thirdStr = input.nextLine();
        System.out.println("Terza stringa: " + thirdStr);

        //unisco le stringhe//
        String firstOrder = firstStr + secondStr + thirdStr;
        System.out.println("Concatenazione in ordine di inserimento: " + firstOrder);

        //mescolo le stringhe//
        String secondOrder = thirdStr + firstStr + secondStr;
        System.out.println("Concatenazione non ordinata: " + secondOrder);

        input.close();

    }

    //usando un metodo//
    public static String concatStrings(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }
}

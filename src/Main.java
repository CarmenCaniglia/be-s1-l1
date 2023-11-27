public class Main {
    public static void main(String[] args) {
        //PUNTO 1//
        int n1 = 4;
        int n2 = 6;
        int result = moltiplica(n1, n2);

        System.out.println("Il risultato della moltiplicazione è:" + result);

        //PUNTO 2//

        String stringa = "Siamo nell'anno:";
        int anno = 2023;

        String newString = concatena(stringa, anno);
        System.out.println(newString);

        //PUNTO 3//
        String[] arrayDiStringhe = {"uno", "due", "tre", "quattro", "cinque"};
        String newStr = "sei";

        String[] newArray = addString(arrayDiStringhe, newStr);
        for (String el : newArray) {
            System.out.println(el);
        }
    }

    public static int moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String concatena(String stringa, int anno) {
        return stringa + anno;
    }

    public static String[] addString(String[] arrayDiStringhe, String newStr) {
        String[] newArray = new String[6];

        for (int i = 0; i < newArray.length; i++) {
            if (i < 3) newArray[i] = arrayDiStringhe[i];
            else if (i == 3) newArray[i] = newStr;
            else newArray[i] = arrayDiStringhe[i - 1];
        }
        return newArray;
    }
}
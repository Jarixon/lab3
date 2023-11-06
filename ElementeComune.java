public class ElementeComune {
    public static void main(String[] args) {
        System.out.println("Introduceți elementele primului șir (separate prin spațiu):");
        String input1 = System.console().readLine();

        System.out.println("Introduceți elementele celui de-al doilea șir (separate prin spațiu):");
        String input2 = System.console().readLine();

        String[] sir1 = input1.split(" ");
        String[] sir2 = input2.split(" ");

        System.out.println("Elementele comune sunt:");
        for (String element1 : sir1) {
            for (String element2 : sir2) {
                if (element1.equals(element2)) {
                    System.out.println(element1);
                }
            }
        }
    }
}

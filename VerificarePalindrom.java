import java.util.Scanner;

public class VerificarePalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un cuvânt pentru a verifica dacă este palindrom: ");
        String cuvant = scanner.nextLine();

        // Eliminăm spațiile și convertim cuvântul la litere mici pentru comparație
        cuvant = cuvant.replaceAll("\\s", "").toLowerCase();

        boolean palindrom = true;
        int lungime = cuvant.length();

        for (int i = 0; i < lungime / 2; i++) {
            if (cuvant.charAt(i) != cuvant.charAt(lungime - 1 - i)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("Cuvântul este palindrom.");
        } else {
            System.out.println("Cuvântul nu este palindrom.");
        }

        scanner.close();
    }
}

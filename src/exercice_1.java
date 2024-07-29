import java.util.Scanner;

public class exercice_1 {
    public static void main(String[] args) {
        // Niveau 1
        int number1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre : ");
        number1 = scanner.nextInt();
        if (number1 % 2 == 0)
        System.out.println("Le nombre est pair.");
      else
        System.out.println("Le nombre est impair.");

        /* 
        // Niveau 2 ajouter tous les nombre premier jusqu'au nombre saisi
        System.out.println("Veuillez saisir un nombre : ");
        int number2 = scanner.nextInt();
        int somme = 0;
        for (int i = 2; i <= number2; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                somme += i;
            }
        }
        System.out.println("La somme des nombres premiers est : " + somme);
        */



        // Niveau 3 trouve le nombre max
        int numbermax = 0;
        while (true) {
            System.out.println("Veuillez saisir un nombre : ");
            int numbermax1 = scanner.nextInt();
            if (numbermax1 == 0) {
                break;
            }

            if (numbermax1 > numbermax) {
                numbermax = numbermax1;
            }
        }
        System.out.println("Le nombre max est : " + numbermax);

        // Niveau 4
        System.out.println("Veuillez saisir un nombre pour le jour de la semaine : ");
        int numberJour = scanner.nextInt();
        switch (numberJour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:     
                System.out.println("Mercredi");
                break;
            case 4: 
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6: 
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Ce n'est pas un jour de la semaine");
                break;
        }

    }

}


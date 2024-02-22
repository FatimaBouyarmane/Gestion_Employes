import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    GestionnaireEmployes manager = new GestionnaireEmployes("Manager", 5000, new Date());
    
    public static void main(String[] args) {
    while (true) {
        System.out.println("\nEmployee Management - Menu:");
        System.out.println("1. Ajoute Employee");
        System.out.println("2. Suuprime Employee");
        System.out.println("3. Liste des Employees");
        System.out.print("Ton choix: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addEmployee();
                break;
            case 2:
                removeEmployee();
                break;
            case 3:
                listEmployees();
                break;
            default:
                System.out.println("Choix invalide. entrez un nombre valide");
            }
        }
        scanner.close();
    }

    private static void addEmployee() {
        System.out.print("Entrez le nom d'employee ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le salaire: ");
        double salaire = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Entrez date d embauche (dd/mm/yyyy): ");
        String DateEmbauche = scanner.nextLine();
        Date DateEmbauche = new Date();
        manager.addEmployee(new Employee(nom, salaire, DateEmbauche));
        System.out.println("Employe est ajoute avec succes");
    }

    private static void removeEmployee() {
        System.out.print("entrez le nom d'employe à supprimer ");
        String nom = scanner.nextLine();
        if (manager.removeEmployee(nom)) {
            System.out.println("Employe supprime avec succes.");
        } else {
            System.out.println("l'employee n'est pas trouvé" );
        }
    }

    private static void listEmployees() {
        System.out.println("\nListe des employees:");
        manager.listEmployees();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class GestionnaireEmployes extends Employe{
    private List<Employe> listeEmployes;

    public GestionnaireEmployes(String nom,double salaire, Date dateEmbauche) {
        super(nom, salaire, dateEmbauche);
        this.listeEmployes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    public void afficherEmployes() {
        for (Employe employe : listeEmployes) {
            System.out.println("Nom: " + employe.getNom() + ", Salaire: " + employe.getSalaire() + ", Date d'embauche: " + employe.getDateEmbauche());
        }
    }
}
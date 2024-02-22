import java.util.Date;

class Employe {
    private String nom;
    double salaire;
    protected Date dateEmbauche;

    public Employe(String nom, double salaire, Date dateEmbauche) {
        this.nom = nom;
        this.salaire = salaire;
        this.dateEmbauche= dateEmbauche;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}

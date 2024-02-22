import java.util.*;

class EmployeFullTime extends Employe{

    private int Heures_Travail;
    private double bonus;

    public EmployeFullTime(String nom,double salaire, Date dateEmbauche,int Heures_Travail, double bonus )
    {
        super(nom, salaire, dateEmbauche);
        this.Heures_Travail = Heures_Travail;
        this.bonus = bonus;
    }
    public int getHeures_Travail() {
        return Heures_Travail;
    }

    public void setHeures_Travail(int Heures_Travail) {
        this.Heures_Travail = Heures_Travail;
    }
    public double CalculeSalaire()
    {
        return (getSalaire() * Heures_Travail) + bonus;

    }


}
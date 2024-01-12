public class Professeur extends Personne{
    private Object specialite = null;

    @Override
    public String toString() {
        return "Professeur{" +
                "specialite=" + specialite +
                '}';
    }

    public Professeur(String nom, String prenom, int anneeNaissance, String email) {
        super(nom, prenom, anneeNaissance, email);
        this.specialite = specialite;


    }
}

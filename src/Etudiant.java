public class Etudiant extends Personne{
    private Object classe = null;
    private final String numeroEtudiant;

    @Override
    public String toString() {
        return "Etudiant{" +
                "classe=" + classe +
                ", numeroEtudiant='" + numeroEtudiant + '\'' +
                '}';
    }

    public Etudiant(String nom, String prenom, int anneeNaissance, String email) {
        super(nom, prenom, anneeNaissance, email);
        this.classe = classe;
        this.numeroEtudiant = nom + prenom.length() + anneeNaissance + "000" + hashCode();


    }

}

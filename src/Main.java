import EtudiantImpl.EtudiantImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création d'une liste d'étudiants et de professeurs
        ArrayList<EtudiantImpl> personnes = new ArrayList<EtudiantImpl>();

        Object Classe = null;
        personnes.add(new EtudiantImpl("moussa", "fall", 1995,));
        personnes.add(new EtudiantImpl("dane", "lo", 1998,));
        boolean add = personnes.add(new EtudiantImpl("Bob", "marley", 1990,));


        // Affichage des données de chaque objet
        for (EtudiantImpl Personne : personnes) {
            System.out.println(Personne.toString());
        }
    }
}
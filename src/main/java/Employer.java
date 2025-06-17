import lombok.*;

@Data
@Builder
public class Employer {
    private String id;
    private String nom;
    private String Prenom;
    private char sexe;
    private double salaire;
    private double salaire_an;
    private String id_e;
}

package metier;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Mostafa ACHRAF on 9/27/2017.
 */

@XmlRootElement(name = "cpte")
public class Compte implements Serializable {

    private int code;
    private double solde;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public Compte() {
    }
}

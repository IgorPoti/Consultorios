package myClass;

import java.util.ArrayList;

public class Plano {
    private Paciente paciente;
    private ArrayList<Plano> planos;

    public Plano() {
        this.planos = new ArrayList();
    }

    public Plano(Paciente paciente, ArrayList<Plano> planos) {
        this.paciente = paciente;
        this.planos = planos;
    }
    
    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the planos
     */
    public ArrayList<Plano> getPlanos() {
        return planos;
    }

    /**
     * @param planos the planos to set
     */
    public void setPlanos(ArrayList<Plano> planos) {
        this.planos = planos;
    }
}

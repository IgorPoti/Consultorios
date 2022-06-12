package myClass;

public class Medico extends Pessoa{
    private int CRM;
    private String especialidade;
    private String clinica;
    private String agenda;

    /**
     * @return the CRM
     */
    public int getCRM() {
        return CRM;
    }

    public Medico() {
    }

    public Medico(int CRM, String especialidade, String clinica, String agenda, String nome, long CPF, String sexo, String endereco, int telefone) {
        super(nome, CPF, sexo, endereco, telefone);
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.clinica = clinica;
        this.agenda = agenda;
    }

    

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade.toUpperCase();
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the agenda
     */
    public String getAgenda() {
        return agenda.toUpperCase();
    }

    /**
     * @param agenda the agenda to set
     */
    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    /**
     * @return the clinica
     */
    public String getClinica() {
        return clinica;
    }

    /**
     * @param clinica the clinica to set
     */
    public void setClinica(String clinica) {
        this.clinica = clinica;
    }
}

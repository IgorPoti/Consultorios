package myClass;

public abstract class Paciente extends Pessoa implements StatusFin{
    private int convenio;
    private String plano;
    private String valorPlano;
   

    public Paciente() {
    }

    public Paciente(int convenio, String plano, String valorPlano, String nome, long CPF, String sexo, String endereco, int telefone) {
        super(nome, CPF, sexo, endereco, telefone);
        this.convenio = convenio;
        this.plano = plano;
        this.valorPlano = valorPlano;
    }

    
    @Override
    public void checkPag(){
        System.out.println("Checando o seu status de financeiro...");
    }
    @Override
    public void pagarOk(){
        System.out.println("Status financeiro: ADIMPLENTE!");
    }
    @Override
    public void pagarNeg(){
        System.out.println("Status financeiro: INADIMPLENTE!");
    }
    /**
     * @return the convenio
     */
    public int getConvenio() {
        return convenio;
    }

    /**
     * @param convenio the convenio to set
     */
    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    /**
     * @return the plano
     */
    public String getPlano() {
        return plano.toUpperCase();
    }

    /**
     * @param plano the plano to set
     */
    public void setPlano(String plano) {
        this.plano = plano;
    }

    /**
     * @return the valorPlano
     */
    public String getValorPlano() {
        return valorPlano;
    }

    /**
     * @param valorPlano the valorPlano to set
     */
    public void setValorPlano(String valorPlano) {
        this.valorPlano = valorPlano;
    }

    /**
     * @return the statusPg
     */
}

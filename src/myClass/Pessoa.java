package myClass;

public abstract class Pessoa {
    private String nome;
    private long CPF;
    private String sexo;
    private String endereco;
    private int telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, long CPF, String sexo, String endereco, int telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome.toUpperCase();
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public long getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo.toUpperCase();
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco.toUpperCase();
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}

public class Squadra {

    private int numero;
    private String nomeAlfaNum;

    public Squadra(int numero, String nomeAlfaNum){

        this.numero = numero;
        this.nomeAlfaNum = nomeAlfaNum;
    }

    // Metodi getter
    public int getNumero() {
        return numero;
    }
    public String getNomeAlfaNum() {
        return nomeAlfaNum;
    }

    //Metodi setter
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setNomeAlfaNum(String nomeAlfaNum) {
        this.nomeAlfaNum = nomeAlfaNum;
    }
}

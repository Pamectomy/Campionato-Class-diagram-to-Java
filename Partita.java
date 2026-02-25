public class Partita {

    private Squadra squadraCasa;
    private Squadra squadraTrasf;
    private int data;
    private int punteggioCasa;
    private int punteggioTrasf;
    private int setVintiCasa;
    private int setVintiTrasf;

    public Partita(Squadra squadraCasa, Squadra squadraTrasf, int data, int punteggioCasa, int punteggioTrasf, int setVintiCasa, int setVintiTrasf){

        this.squadraCasa = squadraCasa;
        this.squadraTrasf = squadraTrasf;
        this.data = data;
        this.punteggioCasa = punteggioCasa;
        this.punteggioTrasf = punteggioTrasf;
        this.setVintiCasa = setVintiCasa;
        this.setVintiTrasf = setVintiTrasf;
    }

    // Metodi getter
    public Squadra getSquadraCasa() {
        return squadraCasa;
    }
    public Squadra getSquadraTrasf() {
        return squadraTrasf;
    }
    public int getData() {
        return data;
    }
    public int getPunteggioCasa() {
        return punteggioCasa;
    }
    public int getPunteggioTrasf() {
        return punteggioTrasf;
    }
    public int getSetVintiCasa() {
        return setVintiCasa;
    }
    public int getSetVintiTrasf() {
        return setVintiTrasf;
    }

    // Metodi setter
    public void setSquadraCasa(Squadra squadraCasa) {
        this.squadraCasa = squadraCasa;
    }
    public void setSquadraTrasf(Squadra squadraTrasf) {
        this.squadraTrasf = squadraTrasf;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setPunteggioCasa(int punteggioCasa) {
        this.punteggioCasa = punteggioCasa;
    }
    public void setPunteggioTrasf(int punteggioTrasf) {
        this.punteggioTrasf = punteggioTrasf;
    }
    public void setSetVintiCasa(int setVintiCasa) {
        this.setVintiCasa = setVintiCasa;
    }
    public void setSetVintiTrasf(int setVintiTrasf) {
        this.setVintiTrasf = setVintiTrasf;
    }
}

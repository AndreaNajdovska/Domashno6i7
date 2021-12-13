public class Fakultet {
    private String ime;
    private int brojSmerovi;
    private int vkupnoStudenti;

    public Fakultet (String ime, int brojSmerovi, int vkupnoStudenti) {
        this.ime = ime;
        this.brojSmerovi = brojSmerovi;
        this.vkupnoStudenti = vkupnoStudenti;
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public int getBrojSmerovi() {
        return brojSmerovi;
    }
    public void setBrojSmerovi(int brojSmerovi) {
        this.brojSmerovi = brojSmerovi;
    }
    public int getVkupnoStudenti() {
        return vkupnoStudenti;
    }
    public void setVkupnoStudenti(int vkupnoStudenti) {
        this.vkupnoStudenti = vkupnoStudenti;
    }

}
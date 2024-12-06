public class Uzivatel {



    private String cisloUzivatele;
    private String nazev;

    public String getCislo() {
        return cisloUzivatele;
    }

    public void setCislo(String cislo) {
        this.cisloUzivatele = cislo;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Uzivatel(String cisloUzivatele, String nazev) {
        this.cisloUzivatele = cisloUzivatele;
        this.nazev = nazev;
    }

    @Override
    public String toString() {
        return "Uzivatel{" +
                "cisloUzivatele='" + cisloUzivatele + '\'' +
                ", nazev='" + nazev + '\'' +
                '}';
    }
}

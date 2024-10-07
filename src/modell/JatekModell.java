package modell;

public class JatekModell {

    private Lada[] ladak;
    private int valasztas;

    public JatekModell() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset!");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset!", true);
        ladak[2] = new Lada("bronz", "Az arany hazudik!");
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat igaz!\n";
        int i = 1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + ". " + a + "láda: " + f + "\n";
        }
        return s;
    }

    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }
    
    public String ellenorzes(){
        String s = "Gratulálok, eltaláltad!";
        s = ladak[valasztas].isKincs() ? s : "Sajnos nem talált!";
        
        /* Mellékhatás:
        az ellenőrzés be is zárja a scannert, de erről nem értesít 
        */
        //sc.close();
        
        return s;
    }        
}

package Blackjacc;

class Kortti {

    /*
 * Luo pelattavan kortin.
     */
    private int arvo;
    private int maa;
    private int value;
    private static String[] arvot = {"Ässä", "Kaksi", "Kolme", "Neljä", "Viisi", "Kuusi", "Seitsemän", "Kahdeksan", "Yhdeksän", "Kymmenen", "Jätkä", "Kuningatar", "Kurko"};
    private static String[] maat = {"Ruutu", "Hertta", "Risti", "Pata"};

    Kortti(int maa, int values) {
        this.arvo = values;
        this.maa = maa;
    }

    /*
 * Palauttaa kortin Stringinä.
     */
    public String toString() {
        return arvot[arvo] + " of " + maat[maa];
    }

    /*
 * Palauttaa kortin arvon.
     */
    public int getArvo() {
        return arvo;
    }

    /*
 * Palauttaa kortin maan.
     */
    public int getMaa() {
        return maa;
    }

    /*
 * Palauttaa kortin valuen. Jos kortti on jätkä, kuningatar tai kurko value on 10. Ässät on 11 tästälähtien.
     */
    public int getValue() {
        if (arvo > 10) {
            value = 10;
        } else if (arvo == 1) {
            value = 11;
        } else {
            value = arvo;
        }
        return value;
    }

    /*
 * Asetetaan kortin value.
     */
    public void setValue(int set) {
        value = set;
    
}
}
package enums;

public enum Continentes {

    AFRICA(53, "1.3 Millones"),
    EUROPA(46, "980 Millones"),
    ASIA(44, "1.650 Millones"),
    AMERICA(34, "650 Millones"),
    OCEANIA(14, "125 Millones");

    private final int paises;	// atributo constante
    private final String habts;	// atributo constante

    Continentes(int paises, String habts) {       // Constructor
        this.paises = paises;
        this.habts = habts;
    }

    public int getPaises() {        // devuelve el valor de la cantidad de paises
        return this.paises;
    }
    public String getHabts() { return this.habts; } 
}

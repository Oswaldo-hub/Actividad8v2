public class card{


    private String palo;
    private String color;
    private String valor;
   public static String[] palo2 = new String[]{"treboles","diamantes","picas","corazones"};
    public static final String[] color2 = new String[]{"negro","rojo"};
    public static final String[] valor2 = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public card (String palo2, String color2, String valor2) {
        this.palo = String.valueOf(palo2);
        this.color = String.valueOf(color2);
        this.valor = String.valueOf(valor2);
    }
    @Override
    public String toString() {
        return "" + palo + " , " + color +
                " ," + valor ;
    }
}



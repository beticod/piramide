package piramide;

public class Metodos {
    private int altura;


    public Metodos(int altura) {
        this.altura = altura;
    }
    
    
    
    public String dibujarPiramideNormal() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= altura; i++) {
            resultado.append(" ".repeat(altura - i));
            resultado.append("*".repeat(2 * i - 1));
            resultado.append("\n");
        }
        return resultado.toString();
    }
    
    
    public String dibujarLineasCentrales() {
        StringBuilder resultado = new StringBuilder();
        int numLineasCentro = altura - 2;

        for (int i = 1; i <= numLineasCentro; i++) {
            if (i == numLineasCentro) {
                resultado.append(" ".repeat((2 * altura - 1 - 6) / 2));
                resultado.append("*".repeat(6));
            } else {
                resultado.append(" ".repeat((2 * altura - 1 - 4) / 2));
                if (i % 2 == 1) {
                    resultado.append("*".repeat(4));
                } else {
                    resultado.append(" ".repeat(4));
                }
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
}

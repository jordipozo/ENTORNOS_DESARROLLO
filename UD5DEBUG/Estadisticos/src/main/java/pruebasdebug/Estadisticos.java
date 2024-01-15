package pruebasdebug;

public class Estadisticos {

    private int m;
    private int n;

    public Estadisticos(int m, int n) throws Exception {
        if (m < 0 || n < 0 || m < n) {
            throw new Exception("Error. " +
                    "Los argumentos tienen que ser >=0 y el primero >= que el segundo");
        }
        this.n = n;
        this.m = m;
    }
    /* Cálculo Factorial o permutaciones de x */
    public double factorial(int x) throws Exception {
        double resultado = 1;
        for (int i = 2; i <= x; i++) {
            resultado *= i;
        }
        return resultado;
    }
    /* Cálculo Combinaciones de m elementos tomados de n en n*/
    public double combinaciones() throws Exception {
        double combi = factorial(m)/(factorial(n)*factorial(m-n));
        return combi;
    }
    /* Cálculo Variaciones de m elementos tomados de n en n */
    public double variaciones() throws Exception {
        double vari = combinaciones()*factorial(n);
        return vari;
    }
    /* Cálculo Variaciones con repetición de m elementos tomados de n en n */
    public double variac_repet() throws Exception {
        double varirepe = Math.pow(m, n);
        return varirepe;
    }
}


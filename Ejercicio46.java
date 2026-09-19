class Ejercicio46 {
    public static void main(String[] args) {
        //46.- ENERGÍA ELÉCTRICA
        double potencia = 1200;
        double h_tiempo = 6;
        double wh = potencia * h_tiempo;
        System.out.println( wh );
        System.out.println( wh / 1000 ); // Conversión a kWh
    }
}

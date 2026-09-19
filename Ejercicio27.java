class Ejercicio27 {
    public static void main(String[] args) {
        //27.- CONVERSIÓN DE SEGUNDOS
        int seg_totales = 10000;
        int h_calc = seg_totales / 3600;
        int m_calc = (seg_totales % 3600) / 60;
        int s_calc = seg_totales % 60;
        System.out.println( h_calc );
        System.out.println( m_calc );
        System.out.println( s_calc );
    }
}

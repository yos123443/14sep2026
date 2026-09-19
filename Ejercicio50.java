class Ejercicio50 {
    public static void main(String[] args) {
        //50.- PROBLEMA INTEGRADOR
        int prod_unidades = 300;
        double prod_costo_u = 16.80;
        double c_total = prod_unidades * prod_costo_u;
        double gan_total = c_total * 0.30;
        double v_venta = c_total + gan_total;
        double igv_total = v_venta * 0.18;
        double p_total = v_venta + igv_total;
        double p_unitario_final = p_total / prod_unidades;
        
        System.out.println( c_total );
        System.out.println( gan_total );
        System.out.println( v_venta );
        System.out.println( igv_total );
        System.out.println( p_total );
        System.out.println( p_unitario_final );
    }
}

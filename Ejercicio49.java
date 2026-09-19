class Ejercicio49 {
    public static void main(String[] args) {
        //49.- DESCOMPOSICIÓN DE TRES CIFRAS
        int num_tres = 748;
        int centenas = num_tres / 100;
        int decenas = (num_tres % 100) / 10;
        int unidades_cifra = num_tres % 10;
        System.out.println( centenas );
        System.out.println( decenas );
        System.out.println( unidades_cifra );
        System.out.println( centenas + decenas + unidades_cifra );
    }
}

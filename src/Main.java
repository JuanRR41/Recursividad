public class Main {
    public static void main(String[] args) {

        //System.out.println(MetodosAuxiliares.cadenaDeNumero(5));
        //System.out.println(MetodosAuxiliares.multiplicacionDeDosNumeros(5,5));
        //System.out.println(MetodosAuxiliares.elevarPotencia(5,3));


        int a[]={90,50,800,60};
        String x= "ol H a";
        String f="Mi mat1ricula es 1234";
        System.out.println(MetodosAuxiliares.verificarValor(a,a.length-1,60));
        System.out.println(MetodosAuxiliares.numeroMasGrande(a,a.length-1,0));
        System.out.println(MetodosAuxiliares.vereficarCadena(x,'o','a',0));
        System.out.println(MetodosAuxiliares.sumaDeCaracteres(f.length()-1,f));
        System.out.println((MetodosAuxiliares.cantidadDeOrejas(10)));


        //System.out.println(MetodosAuxiliares.sumarArregloDeNumeros(a,a.length));
        //System.out.println(MetodosAuxiliares.cadenaDeFraccion(6));
    }
}

public class MetodosAuxiliares {


    public static int fac(int n){
        if(n==0)
            return 1;
        else
            return n*fac(n-1);
    }
    public static String cadenaDeNumero(int n){
        if(n==0)
            return ""+0;
        else
        return n+","+cadenaDeNumero(n-1);
    }
    public static int multiplicacionDeDosNumeros(int x,int y){
        if(y==0)
            return 0;
        else
        return x+multiplicacionDeDosNumeros(x,y-1);
    }
    public static int elevarPotencia(int x,int y){
        if(y==0)
            return 1;
        else
            return x*elevarPotencia(x,y-1);
    }
    public static int sumarArregloDeNumeros(int[] x,int y){
        if (y==0)
            return 0;
        else
            return x[y-1] + sumarArregloDeNumeros(x,y-1);
    }
    public static String cadenaDeFraccion(int x){
        if (x == 0)
            return "";
        else
            return "1/"+x+"^2 "+cadenaDeFraccion(x-1);
    }

    public static int verificarValor(int[] x,int y,int z){
        if(z == x[y])
            return y;
        else if(y==0)
            return -1;
        else return verificarValor(x,y-1,z);
    }
    public static int numeroMasGrande(int[] x,int y,int aux) {
        if (y==-1)
            return aux;
        else if (x[y] > aux)
            aux=x[y];
        return numeroMasGrande(x, y - 1, aux);
    }
    public static Boolean vereficarCadena(String x,char c1,char c2,int c){
        if(x.charAt(c)==c1)
            return true;
        else if (x.charAt(c)==c2)
            return false;
        else return vereficarCadena(x,c1,c2,c+1);
    }
    public static int cantidadDeOrejas(int x){
        if(x==0)
            return 0;
        else
            return 2+cantidadDeOrejas(x-1);
    }

    public static int sumaDeCaracteres(int pos,String palabra){
        if(pos==-1)
            return 0;
        else if(!Character.isDigit(palabra.charAt(pos))){
            return 0+sumaDeCaracteres(pos-1,palabra);
        }
        else return Character.getNumericValue(palabra.charAt(pos))+sumaDeCaracteres(pos-1,palabra);
    }
}

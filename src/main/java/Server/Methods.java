package Server;

public class Methods {
    public boolean suma(int a, int b){
        int su = a+b;

        DaoCal daoOperacion= new DaoCal();
           String operacion = "suma";
           String datos_ingresados = "primer numero"+a+"segundo numero"+b;
           String resultado = ""+su;
           boolean result = daoOperacion.saveOperacion(operacion,datos_ingresados, resultado);

        return result ;
    }
    public boolean resta(int a, int b){
        int resta = a-b;
        DaoCal daoOperacion= new DaoCal();
        String operacion = "resta";
        String datos_ingresados = "primer numero"+a+"segundo numero"+b;
        String resultado = ""+resta;
        boolean result = daoOperacion.saveOperacion(operacion,datos_ingresados, resultado);

        return result ;
    }
    public boolean multipliacion(int a, int b){
        int multi = a*b;
        DaoCal daoOperacion= new DaoCal();
        String operacion = "multiplicacion";
        String datos_ingresados = "primer numero"+a+"segundo numero"+b;
        String resultado = ""+multi;
        boolean result = daoOperacion.saveOperacion(operacion,datos_ingresados, resultado);

        return result ;
    }
    public boolean divison (int a, int b){
        int divi = a/b;
        DaoCal daoOperacion= new DaoCal();
        String operacion = "division";
        String datos_ingresados = "primer numero"+a+"segundo numero"+b;
        String resultado = ""+divi;
        boolean result = daoOperacion.saveOperacion(operacion,datos_ingresados, resultado);

        return result ;
    }
    public boolean raiz(int a){
        int r = (int) Math.sqrt(a);

        DaoCal daoOperacion= new DaoCal();
        String operacion = "Raiz";
        String datos_ingresados = "primer numero"+a;
        String resultado = ""+r;
        boolean result = daoOperacion.saveOperacion(operacion,datos_ingresados, resultado);

        return result ;
    }
}

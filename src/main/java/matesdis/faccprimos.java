package matesdis;

import java.util.ArrayList;


public class faccprimos extends AbsDis{
    
    private int a,b,c,d,e;
    private int i;

    public faccprimos() {
    }

    public faccprimos(int a) {
        this.a = a;
    }
    
    ArrayList<Integer> vector = new ArrayList<>();

    
    @Override
public long mostrarRes() {
    int numero = a; // guardamos 'a' en una variable auxiliar para no perder el valor original
    
    for (int i = 2; i <= numero; i++) {
        while (numero % i == 0) {
            vector.add(i);      // i es un factor primo, lo agregamos
            numero /= i;        // dividimos el número para seguir buscando
        }
    }
    
    System.out.println(a + " = " + vector);
    
    return 0;
    }
}    
        
        
       

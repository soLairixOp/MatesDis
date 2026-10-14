package matesdis;

public class amodb extends AbsDis{

    private int c;

    public amodb() {
    }

    private int a,b; 

    public amodb(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    @Override
    public long mostrarRes() {
    long m = 1;
    long base = a % b; // normaliza la base también, por si acaso
    
    for (int i = 0; i < c; i++) {
        m = (m * base) % b;
    }
    
    System.out.println(a + "^" + c + " (mod " + b + ") = " + m);
    
    return (int) m;

    }
}


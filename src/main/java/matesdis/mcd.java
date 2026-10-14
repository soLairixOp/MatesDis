package matesdis;

public class mcd extends AbsDis{

    private int a,b;

    public mcd(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public long mostrarRes() {
        System.out.print("El MCM de : " + a + " y " + b + " es: ");
        long r=0,m=0;
        while(b != 0){
        double q;
        m =r;
        q= Math.floor(a/b);
        r = (int) (a - b * q);
        a=b;
        b=(int) r;
        }
        
        System.out.print(a+ "   ");
        return a;
    }
    
}

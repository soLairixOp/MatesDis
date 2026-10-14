package matesdis;
import java.util.Scanner;
public class MatesDis {
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("""
                           q kieres wei 
                           1. MCD 
                           2. Fact Primos 
                           3. a(mod b) """);
        int sw;
        sw = sc.nextInt();
        switch(sw){
    case 1:  
                System.out.println("""
                                   Metodo para resolver cosas de la forma 
                                   MCD(a,b) ) 
                                   Dame a""");
                int a = sc.nextInt();

                System.out.println("Dame b");
                int b = sc.nextInt();
                mcd md = new mcd(a,b);
                System.out.println("Resultado: "+ md.mostrarRes());
                
                break;            
        case 2:  
                System.out.println("""
                                   Metodo para factorizar en primos 
                                   a = p1*p...*pn ) 
                                   Dame a""");
                a = sc.nextInt();
                faccprimos fac = new faccprimos(a);
                System.out.println("Resultado: "+ fac.mostrarRes());
                break;
            case 3:  
                System.out.println("""
                                   Metodo para resolver cosas de la forma 
                                   a(mod b ) 
                                   Dame a""");
                a = sc.nextInt();
                System.out.println("Dame el exponente de a");
                int c = sc.nextInt();
                System.out.println("Dame b");
                b = sc.nextInt();
                amodb mood = new amodb(a,b,c);
                System.out.println("Resultado: "+ mood.mostrarRes());
                
                break;
        
        
        }
    }
}

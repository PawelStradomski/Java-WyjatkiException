
package wyjatki.exception;
/**
 * 
 * @author pawelstradomski
 */

public class WyjatkiException {

    
    public static void main(String[] args) {
        
        /* 
                        Exception - Wyjatki:
        try - Blok w ktorym instrukcja potencjalnie powoduje blad
        catch - Blok zwrocony blad/wyjatek
        finally - Blok instrukcji ktora zawsze bedzie wykonana
        
        */
        
        try
        {
            System.out.println(5/0);
            System.out.println("Instrukcja po instrukcji powodujacej blad nie jest wykonana");
        }
        catch(ArithmeticException ex) // w skrocie mozna Exception
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("Instrukcje ktore zawsze beda wykonane");
        }
        
        // 2 sposob
        
        int a = 10;
        try
        {
            if(a==10)
                throw new NaszWyjatek("a jest rowne 10");
        }
        catch(NaszWyjatek X)
        {
            System.out.println(X.getMessage());
        }
 
        
    }
    
}
class NaszWyjatek extends Exception
{

    public NaszWyjatek(String string) 
    {
        super(string);
    }
    
}
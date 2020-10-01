package SingletonTest;

/**
 *
 * @author alsorc
 */
public class ObjetoA {
    
    private static ObjetoA instanciaA;
    
    private ObjetoA() {
        
    }
    
    public static ObjetoA getInstance(){
        if(instanciaA == null){
            instanciaA = new ObjetoA();
        }
        return instanciaA;
    }
    
    
}

package SingletonTest;

/**
 *
 * @author alsorc
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ObjetoA instancia1 = ObjetoA.getInstance();
        ObjetoA instancia2 = ObjetoA.getInstance();
        
        ObjetoB instancia3 = new ObjetoB();
        ObjetoB instancia4 = new ObjetoB();
        
        System.out.println("---DIRECCIÓN DE MEMORIA OBJETO A---");
        System.out.println(instancia1);
        System.out.println(instancia2);
        System.out.println("---DIRECCIÓN DE MEMORIA OBJETO B---");
        System.out.println(instancia3);
        System.out.println(instancia4);
        
    }
    
}

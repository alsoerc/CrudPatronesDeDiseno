package crudpatrones;

/**
 *
 * @author alsorc
 */

public class FactoryDao {
    
    public enum Type {
        AGENDA, DEPARTAMENTO
    }
    
    public static IDao getDao(Type opcion){
        IDao dao = null;
        switch(opcion){
            case AGENDA:
                dao = new DaoAgenda();
                break;
            case DEPARTAMENTO:
                System.out.println("No tengo disponible");
                break;
            default:
                System.out.println("ERROR, dao no encontrado");
        }
        return dao;
    }
    
}

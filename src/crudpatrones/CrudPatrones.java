package crudpatrones;

import crudpatrones.models.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alsorc
 */
public class CrudPatrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        IDao myDao = FactoryDao.getDao(FactoryDao.Type.AGENDA);
        DaoAgenda myDaoAgenda = new DaoAgenda();
        User miUsuario = new User();
        
        miUsuario.setId(5);
        miUsuario.setName("Alonso");
        miUsuario.setDirection("Cordoba");
        
        System.out.println(myDao.insertRecord(miUsuario));
        
        
//        
//        User myUsuario = (User) myDao.readOneRecord(1);
//        System.out.println(myUsuario.getId() + " " +  myUsuario.getName());
        
        
//        List<User> registros  = myDao.readRecords();
//        
//        for(User usuario : registros ){
//            System.out.println(usuario.getId() + " " + usuario.getName() 
//                    + " " + usuario.getDirection());
//        }
        
    }  
    
    
}

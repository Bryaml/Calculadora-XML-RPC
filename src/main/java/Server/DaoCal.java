package Server;

import utils.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DaoCal {
    public boolean saveOperacion(String operacion, String datos_ingresados, String resultado){
        boolean result=false;
        try(Connection connection= MySQLConnection.getConnection();
            PreparedStatement pstm= connection.prepareStatement(
                    "insert into operacion(operacion, datos_ingresados,resultado) values (?,?,?);"
            )
        ){
            pstm.setString(1,operacion);
            pstm.setString(2,datos_ingresados);
            pstm.setString(3,resultado);
            result=pstm.executeUpdate()==1;

        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}

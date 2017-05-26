/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residente;

import javax.ejb.Local;

/**
 *
 * @author Emtor
 */
@Local
public interface SacarNombreLocal {

    String obtenerNombre(int codven, int cantidad);

    String vendedores(int codven, int nombre);
    
}

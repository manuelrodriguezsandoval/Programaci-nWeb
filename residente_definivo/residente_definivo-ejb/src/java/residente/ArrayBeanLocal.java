/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residente;

import javax.ejb.Local;

/**
 *
 * @author Manuel_FC
 */
@Local
public interface ArrayBeanLocal {

    String menu(int codigoMenu, int datoMenu);
    
}

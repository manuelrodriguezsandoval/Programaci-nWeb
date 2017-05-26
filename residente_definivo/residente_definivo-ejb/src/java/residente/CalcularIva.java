/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residente;

import javax.ejb.Stateless;

/**
 *
 * @author Emtor
 */
@Stateless
public class CalcularIva implements CalcularIvaLocal {

    @Override
    public Integer calcularIvaMenu(int ivaMenu) {
        return (ivaMenu * 119) / 100;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residente;

import javax.ejb.Stateless;

/**
 *
 * @author Manuel_FC
 */
@Stateless
public class ArrayBean implements ArrayBeanLocal {

    @Override
    public String menu(int codigoMenu, int datoMenu) {
        
        String[][] menu=new String[4][11];
        //codigo nombre acompañamiento precio
        menu[0][0]="1";
        menu[0][1]="cazuela";
        menu[0][2]="3000";
        menu[0][0]="2";
        menu[0][1]="vacuno";
        menu[0][2]="3000";
        menu[0][0]="3";
        menu[0][1]="pollo";
        menu[0][2]="3000";
        menu[0][0]="5";
        menu[0][1]="paila";
        menu[0][2]="3000";
        menu[1][0]="1";
        menu[1][1]="tomate";
        menu[1][2]="1500";
        menu[1][0]="2";
        menu[1][1]="lechuga";
        menu[1][2]="1000";
        menu[1][0]="3";
        menu[1][1]="repollo";
        menu[1][2]="1200";
        menu[1][0]="4";
        menu[1][1]="pepino";
        menu[1][2]="1200";
        menu[2][0]="1";
        menu[2][1]="sprite";
        menu[2][2]="1400";
        menu[2][0]="2";
        menu[2][1]="fanta";
        menu[2][2]="1400";
        menu[2][0]="2";
        menu[2][1]="cerveza";
        menu[2][2]="1400";
        menu[2][0]="3";
        menu[2][1]="vino";
        menu[2][2]="1400";
        menu[3][0]="1";
        menu[3][1]="Fabian Leonard";
        menu[3][2]="vendedor";
        menu[3][0]="2";
        menu[3][1]="Emanuel Toro";
        menu[3][2]="vendedor";
        menu[3][0]="3";
        menu[3][1]="Manuel Rodriguez";
        menu[3][2]="vendedor";
        menu[3][0]="4";
        menu[3][1]="Nelson Ganga";
        menu[3][2]="vendedor";

        return menu[codigoMenu][datoMenu];
    }
    
}

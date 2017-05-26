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
public class SacarNombre implements SacarNombreLocal {

    @Override
    public String obtenerNombre(int a, int b) {
        String[][] menu=new String[3][8];
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
        

        return menu[a][b];
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public String vendedores(int codven, int nombre) {
        
        String vendedor[][]=new String[1][8];
        vendedor[1][0]="1";
        vendedor[1][1]="Emanuel Toro";
        vendedor[2][0]="2";
        vendedor[2][1]="Fabian Leonard";
        vendedor[3][0]="3";
        vendedor[3][1]="Manuel Rodriguez";
        vendedor[4][0]="4";
        vendedor[4][1]="Nelson Ganga";
        return vendedor [codven][nombre];
    }
}

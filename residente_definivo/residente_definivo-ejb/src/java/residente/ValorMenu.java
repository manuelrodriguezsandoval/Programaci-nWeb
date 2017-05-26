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
public class ValorMenu implements ValorMenuLocal {

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer obtenerValor(java.lang.String idMenu) {
        int valorM=0;
       
       if ("Cazuela de Ave".equals(idMenu)) {
        valorM=3200;
        } else {
            if("Cazuela de Vacuno".equals(idMenu)) {
                valorM=4000;
            } else{
                if("Pollo con papas fritas".equals(idMenu)){
                    valorM=3500;
                }else{
                    if("Paila marina".equals(idMenu)){
                    valorM=4500;
                }
                }
            }       
            
        }      
       
    return valorM;}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer valorEnsalada(java.lang.String idEnsalada) {
        int valorE=0;
       
       if ("Sin Ensalada".equals(idEnsalada)) {
        valorE=0;
        } else {
            if("Lechugas".equals(idEnsalada)) {
                valorE=700;
            } else{
                if("Tomate".equals(idEnsalada)){
                    valorE=1100;
                    } else{
                        if("Pepinos".equals(idEnsalada)){
                        valorE=900; }
                }
            }       
            
        }
    return valorE;}

    @Override
    public Integer valorBebestible(java.lang.String bebestible) {
        int valorB=0;
       
       if ("Agua".equals(bebestible)) {
        valorB=0;
        } else {
            if("Bebida de Fantasia".equals(bebestible)) {
                valorB=1000;
            } else{
                if("Cerveza".equals(bebestible)){
                    valorB=1500;
                }if("Vino".equals(bebestible)){
                    valorB=2000;
                }
            }       
       } return valorB;
    }
    
    
}
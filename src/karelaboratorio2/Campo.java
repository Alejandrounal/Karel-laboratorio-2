/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karelaboratorio2;

/**
 *
 * @author Alejandro
 */
import becker.robots.*;
public class Campo {
private City ciudad;

    public Campo() {
        this.ciudad = new City();
        
        for (int i = 0; i < 8; i++) { // Crea muros arriba
             Wall pared = new Wall(ciudad, 1, i, Direction.NORTH);
        }
        
        for (int i = 1; i < 13; i++) { // Crea muros derecha
             Wall pared = new Wall(ciudad, i, 7, Direction.EAST);
        }
        
        for (int i = 0; i < 8; i++) {// Crea muros derecha
            Wall pared = new Wall(ciudad,12,i,Direction.SOUTH);
        }
        
        for (int i = 1; i < 13; i++) {
            Thing cosa = new Thing(ciudad,i,7);
        }
         Estante estante1 = new Estante(ciudad,1,2);
         Estante estante2 = new Estante(ciudad,1,4);
         estante1.start();
         estante2.start();
        
    }

   
    
}

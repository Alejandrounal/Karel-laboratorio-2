/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karelaboratorio2;

import becker.robots.*;
/**
 *
 * @author Alejandro
 */
public class Estante extends Thread { 
   private Robot robot;
   private Caja[] cajas;

    public Estante(City ciudad, int avenida, int calle) {
        this.robot = new Robot(ciudad,avenida,calle,Direction.EAST);
        cajas = new Caja[3];
    }
    
    public void darVuelta(){
        for (int i = 0; i < 4; i++) {
            robot.turnLeft();
        }
}
    
    public void moverFondo(){
        for (int i = 0; i < 3; i++) {
            robot.turnLeft();
        }
        robot.move();
        robot.turnLeft();
       
        while(robot.frontIsClear()){
            if(robot.examineRobots().hasNext()){
                while(robot.examineRobots().next().getStreet() > robot.getStreet()){
                   this.darVuelta();
                }
                }else{
                robot.move();
            }
            
    }
    } 
   
    
   @Override
    public void run(){
        this.moverFondo();
    }
    
}


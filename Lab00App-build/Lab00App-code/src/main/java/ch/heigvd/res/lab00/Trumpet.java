/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Thibault
 */

public class Trumpet implements IInstrument {
    
    private final String sound = "pouet";
    private final int soundVolume = 20;
    private final String color = "golden";
    
    public Trumpet(){
        
    }
    
    public String play(){
        return this.sound;
    }
    
    public int getSoundVolume() {
        return this.soundVolume;
    }
    
    public String getColor(){
        return this.color;
    }
    
}


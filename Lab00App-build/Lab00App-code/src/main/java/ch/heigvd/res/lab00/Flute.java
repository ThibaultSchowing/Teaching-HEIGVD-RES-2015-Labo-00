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
public class Flute implements IInstrument{
    
    private final int soundVolume = 10;
    private final String sound = "Fluluu";
    private String color = "Red";

    @Override
    public int getSoundVolume() {
        return soundVolume;
    }

    @Override
    public String play() {
        return sound;
    }

    @Override
    public String getColor() {
        return color;
    }
    
}

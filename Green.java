import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Actor
{
    
    /**
     * Constructor for objects of class Green.
     * 
     */
    public Green()
    {
        GreenfootImage blueImage = new GreenfootImage(40, 40);
        Color c = new Color(34, 112, 33);
        
        blueImage.setColor(c);
        blueImage.fillRect(0, 0, 40, 40);
        
        setImage(blueImage);
    }
    
    public void act() 
    {
        
        
        
    }    
       
}

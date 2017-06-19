import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red extends Actor
{
    
    /**
     * Constructor for objects of class Red.
     * 
     */
    public Red()
    {
        GreenfootImage redImage = new GreenfootImage(40, 40);
        
        Color c = new Color(209, 45, 20);
        
        redImage.setColor(c);
        redImage.fillRect(0, 0, 40, 20);
        
        setImage(redImage);
    }
    
    
    /**
     * Act - do whatever the Red wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}

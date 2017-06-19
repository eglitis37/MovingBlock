import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Pink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pink extends Actor
{
    
    /**
     * Constructor for objects of class Pink.
     * 
     */
    public Pink()
    {
        GreenfootImage pinkImage = new GreenfootImage(40, 40);
        
        pinkImage.setColor(Color.PINK);
        pinkImage.fillRect(0, 0, 40, 40);
        
        setImage(pinkImage);
    }
    
    /**
     * Act - do whatever the Pink wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

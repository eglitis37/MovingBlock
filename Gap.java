import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Gap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gap extends Actor
{
    
    /**
     * Constructor for objects of class Gap.
     * 
     */
    public Gap()
    {
        GreenfootImage gapImage = new GreenfootImage(40, 40);
        Color c = new Color(0.1f, 0f, 0.2f, 0.1f);
        
        gapImage.setColor(c);
        gapImage.fillRect(0, 0, 40, 40);
        
        setImage(gapImage);
    }
    
    /**
     * Act - do whatever the Gap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

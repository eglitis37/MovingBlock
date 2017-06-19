import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Music1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music1 extends Actor
{
    
    /**
     * Constructor for objects of class Music1.
     * 
     */
    public Music1()
    {
        GreenfootImage gapImage = new GreenfootImage(40, 40);
        Color c = new Color(0.1f, 0f, 0.2f, 0.1f);
        
        gapImage.setColor(c);
        gapImage.fillRect(0, 0, 40, 40);
        
        setImage(gapImage);
    }
    
    /**
     * Act - do whatever the Music1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

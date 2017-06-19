import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private static final int WAVE_RELOAD_TIME = 5;

    private GreenfootImage slime = new GreenfootImage("Slime.jpg");
    private GreenfootImage jump = new GreenfootImage("Jump.png");
    private GreenfootImage dash = new GreenfootImage("dash.png");

    private int y = 1;
    private int ySpeed = 1;
    private int smallUp = -6;
    private int up = -1;
    private boolean cannotJump = false;
    private boolean touchedGap = false;
    private boolean lookingRight = true;

    private int dashDelay;
    
    /**
     * Constructor for objects of class Player.
     * 
     */
    public Player()
    {
        setImage(slime);
        dashDelay = 10;
    }
    
    /**
     * movements allows player to move by pressing the right keys and changes the image to the side you are looking for.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void movement()
    {
        if( Greenfoot.isKeyDown("right"))
        {
            if( lookingRight == false)
            {
                slime.mirrorHorizontally();
                jump.mirrorHorizontally();
            }

            lookingRight = true;
            setLocation(getX() + 1, getY());
        }

        if( Greenfoot.isKeyDown("left"))
        {
            if( lookingRight == true)
            {
                slime.mirrorHorizontally();
                jump.mirrorHorizontally();
            }

            lookingRight = false;
            setLocation(getX() - 1, getY());
        }

        if( Greenfoot.isKeyDown("up"))
        {
            if (cannotJump == false)
            {
                setImage(jump);

                y = up;
                fall();
            }
        }

        if( Greenfoot.isKeyDown("z"))
        {
            dash();
            setImage(dash);
        }

    }
    
    /**
     * dash teleports the player forward or backward depending where the player is looking and changes it's picture.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void dash()
    {
        if( dashDelay >= WAVE_RELOAD_TIME)
        {
            if( lookingRight == false)
            {
                dash.mirrorHorizontally();
                jump.mirrorHorizontally();
                lookingRight = true;
                setLocation(getX() -2 , getY());
            }
            else if(lookingRight == true)
            {
                dash.mirrorHorizontally();
                jump.mirrorHorizontally();
                lookingRight = false;
                setLocation(getX() + 2, getY());
            }
        }
        dashDelay = 0;
    }
    
    /**
     * checkCollision checks for anything that player is touching and if so, makes the changed to the world accordingly.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void checkCollision()
    {
        World1 myWorld = (World1)getWorld();
        if(isTouching(Cup.class))
        {
            removeTouching(Cup.class);
            myWorld.win();
        }
        
        if(isTouching(Music1.class))
        {
            myWorld.stage1();
        }
        
        if(isTouching(Music2.class))
        {
            myWorld.stage2();
        }
        
        if(isTouching(Music3.class))
        {
            myWorld.stage3();
        }
        
        if(isTouching(Portal.class))
        {
            myWorld.prepare2();
        }
        
        if(isTouching(Portal2.class))
        {
            myWorld.prepare3();
        }
        
        if (getOneObjectAtOffset(0, 0, Red.class) != null)
        {
            setLocation(getX(), getY() - 1);
        }
        
        if(isTouching(Spike.class))
        {
            myWorld.gameOver();
        }
        else if(isTouching(Rocket.class))
        {
            myWorld.gameOver();
        }
        
        if(isTouching(Key.class))
        {
            removeTouching(Key.class);
            myWorld.portal();
        }
        
        if(isTouching(Bouncer.class))
        {
            flying();
        }
        
        if(getOneObjectAtOffset(0, 1, Gap.class) != null)
        {
            touchedGap = true;
        }
        
        if(getOneObjectAtOffset(0, 1, Ladder.class) != null)
        {
            touchedGap = true;
        }
        
        if(getOneObjectAtOffset(0, 1, Red.class) != null )
        {
            setImage(slime);
            cannotJump = false;
            y = 1;
            touchedGap = false;
        }
        else if (getOneObjectAtOffset(0, 1, Green.class) != null)
        {
            Red red = new Red();
            getWorld().addObject( red, getX(), getY() + 1);
            setImage(slime);
            cannotJump = false;
            y = 1;
            touchedGap = false;
        }
        else if (getOneObjectAtOffset(0, 1, Pink.class) != null)
        {
            Red red = new Red();
            getWorld().addObject( red, getX(), getY() + 1);
            setImage(slime);
            cannotJump = false;
            y = 1;
            touchedGap = false;
        }
        else if (getOneObjectAtOffset(0, 1, Yellow.class) != null)
        {
            Red red = new Red();
            getWorld().addObject( red, getX(), getY() + 1);
            setImage(slime);
            cannotJump = false;
            y = 1;
            touchedGap = false;
        }
        else
        {
            fall();
        }
        
        if(getOneObjectAtOffset(0, 1, Ladder.class) != null )
        {
            setImage(slime);
            cannotJump = false;
            y = 1;
            touchedGap = false;
        }
    }
    
    /**
     * fall Allows this world to have gravity and actually accelerate when falling.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void fall()
    {
        cannotJump = true;
        setLocation( getX(), getY()+y);
        if(touchedGap == false)
        {
            y = ySpeed + y;
        }
    }
    
    /**
     * flying allows player to acceletare upwards when jumping on a specific block.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void flying()
    {
        cannotJump = true;
        setLocation( getX(), getY()-y);
        if(touchedGap == false)
        {
            y = ySpeed - y;
        }
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        checkCollision();
        dashDelay++;
    }    
}

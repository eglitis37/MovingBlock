import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{
    
    private int score = 0;
    private Player user;
    private int rocketDelay;
    
    GreenfootSound stage1 = new GreenfootSound("stage1.mp3");
    GreenfootSound stage2 = new GreenfootSound("stage2.mp3");
    GreenfootSound stage3 = new GreenfootSound("stage3.mp3");
    GreenfootSound lose = new GreenfootSound("gameover.wav");
    GreenfootSound win = new GreenfootSound("win.wav");
    
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 20x20 pixels.
        super(15, 10, 40); 
        setPaintOrder(Player.class);
        prepare();
    }
    
    public void act()
    {
        if( rocketDelay >= 40)
        {
            addObject(new Rocket(), 15, getHeight() - 9);
            addObject(new Rocket(), 15, getHeight() - 5);
            addObject(new Rocket(), 15, getHeight() - 2);
            rocketDelay = 0;
        }
        rocketDelay++;
        
    }
    
    /**
     * stage1 plays the right music when this method is activated.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void stage1()
    {
        stage1.playLoop();
    }
    
    /**
     * stage2 plays the right music when this method is activated and stops the one before.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void stage2()
    {
        stage1.stop();
        stage2.playLoop();
    }
    
    /**
     * stage3 plays the right music when this method is activated and stops the one before.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void stage3()
    {
        stage2.stop();
        stage3.playLoop();
    }
    
    /**
     * gameOver shows the text and stops Greenfoot when this method is activated.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void gameOver()
    {
        showText("You Have Been Defeated!\nPress Run To Play Again.", getWidth()/2, getHeight()/2);
        stage1.stop();
        stage2.stop();
        stage3.stop();
        lose.play();
        Greenfoot.stop();
    }

    /**
     * prepare prepares the world with the right objects in it when the game starts.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void prepare()
    {
        user = new Player();
        
        for( int i = 0; i<= getWidth()-2; i++ )
        {
            addObject(new Green(), i*1, getHeight() - 8);
        }
        
        for( int i = 1; i<= getWidth(); i++ )
        {
            addObject(new Green(), i*1, getHeight() - 4);
        }
        
        for( int i = 0; i<= getWidth(); i++ )
        {
            addObject(new Green(), i*1, getHeight());
        }
        addObject(new Gap(), 15,getHeight()-8);
        addObject(new Gap(), 0,getHeight()-4);
        
        
        addObject(new Spike(), 12,getHeight()-10);
        addObject(new Spike(), 8,getHeight()-10);
        
        addObject(new Green(), 12,getHeight()-7);
        addObject(new Green(), 7,getHeight()-7);
        addObject(new Green(), 3,getHeight()-7);
        
        addObject(new Green(), 10,getHeight()-5);
        addObject(new Green(), 5,getHeight()-5);
        
        addObject(new Red(), 10,getHeight()-5);
        addObject(new Red(), 5,getHeight()-5);
        
        addObject(new Spike(), 12,getHeight()-6);
        addObject(new Spike(), 7,getHeight()-6);
        addObject(new Spike(), 3,getHeight()-6);
        
        addObject(user, 1, 1);
        addObject(new Portal(), 15, getHeight() - 3);
        addObject(new Portal(), 15, getHeight() - 2);
        
        addObject(new Music1(), 1, 1);
    }
    
    /**
     * prepare2 prepares the world with the right objects in it when this method is used and clears all the objects before.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void prepare2()
    {
        List greenObjects = getObjects(Green.class);
        List redObjects = getObjects(Red.class);
        List spikeObjects = getObjects(Spike.class);
        List rocketObjects = getObjects(Rocket.class);
        List portalObjects = getObjects(Portal.class);
        List gapObjects = getObjects(Gap.class);
        List music1Objects = getObjects(Music1.class);
        
        removeObjects(greenObjects);
        removeObjects(redObjects);
        removeObjects(spikeObjects);
        removeObjects(rocketObjects);
        removeObjects(portalObjects);
        removeObjects(gapObjects);
        removeObjects(music1Objects);
        
        
        for( int i = 1; i<= getWidth(); i++ )
        {
            addObject(new Pink(), i*1, getHeight() - 8);
        }
        
        for( int i = 0; i<= getWidth()-2; i++ )
        {
            addObject(new Pink(), i*1, getHeight() - 4);
        }
        
        for( int i = 0; i<= getWidth(); i++ )
        {
            addObject(new Pink(), i*1, getHeight());
        }
        
        addObject(new Ladder(), 15,getHeight()-2);
        addObject(new Ladder(), 15,getHeight()-3);
        addObject(new Ladder(), 15,getHeight()-4);
        
        addObject(new Ladder(), 0,getHeight()-5);
        addObject(new Ladder(), 0,getHeight()-6);
        addObject(new Ladder(), 0,getHeight()-7);
        addObject(new Ladder(), 0,getHeight()-8);
        
        addObject(new Key(), 15,getHeight()-9);
        
        user.setLocation(0, 8);
        addObject(new Music2(), 0, 8);
        addObject(new Music2(), 1, 8);
    }
    
    /**
     * prepare3 prepares the world with the right objects in it after this method is used and clears all the objects before.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void prepare3()
    {
        List pinkObjects = getObjects(Pink.class);
        List redObjects = getObjects(Red.class);
        List spikeObjects = getObjects(Spike.class);
        List rocketObjects = getObjects(Rocket.class);
        List portalObjects = getObjects(Portal2.class);
        List gapObjects = getObjects(Gap.class);
        List ladderObjects = getObjects(Ladder.class);
        List music2Objects = getObjects(Music2.class);
        
        removeObjects(pinkObjects);
        removeObjects(redObjects);
        removeObjects(spikeObjects);
        removeObjects(rocketObjects);
        removeObjects(portalObjects);
        removeObjects(gapObjects);
        removeObjects(ladderObjects);
        removeObjects(music2Objects);
        
        addObject(new Red(), 0,getHeight());
        addObject(new Red(), 1,getHeight());
        addObject(new Red(), 2,getHeight());
        addObject(new Red(), 3,getHeight());
        addObject(new Red(), 4,getHeight());
        addObject(new Red(), 5,getHeight());
        addObject(new Red(), 6,getHeight());
        addObject(new Red(), 7,getHeight());
        addObject(new Red(), 8,getHeight());
        
        for( int i = 0; i<= getWidth(); i++ )
        {
            addObject(new Yellow(), i*1, getHeight());
        }
        
        for( int i = 0; i<= getWidth()-12; i++ )
        {
            addObject(new Yellow(), i*1, getHeight() - 8);
        }
        
        for( int i = 0; i<= getWidth()-8; i++ )
        {
            addObject(new Yellow(), i*1, getHeight() - 4);
        }
        
        addObject(new Bouncer(), 8,getHeight()-2);
        addObject(new Bouncer(), 5,getHeight()-5);
        addObject(new Cup(), 0, 1);
        
        addObject(new Music3(), 15, 8);
        addObject(new Music3(), 14, 8);
        user.setLocation(15, 8);
    }
    
    /**
     * portal Adds two portal blocks at the right location when this method is activated.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void portal()
    {
        addObject(new Portal2(), 0,getHeight()-3);
        addObject(new Portal2(), 0,getHeight()-2);
    }
    
    /**
     * win shows text in the middle that you won and stops the Greenfoot.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void win()
    {
        showText("Congratulation!\n You Just Won The Game", getWidth()/2, getHeight()/2);
        win.play();
        Greenfoot.stop();
        stage3.stop();
    }
    
}

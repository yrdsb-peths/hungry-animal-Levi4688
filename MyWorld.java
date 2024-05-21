import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in.
 * 
 * @author Levi
 * @version May 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 320);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
        createBoom();
        createBanana();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel,300, 200);
    }
    
    
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void increaseScore2()
    {
        score++;
        score++;
        scoreLabel.setValue(score);
        
        if(score % 7 == 0)
        {
            level += 1;
        }
    }
    
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    public void createBoom()
    {
        Boom boom = new Boom();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(boom, x, y);
    }
    
    public void createBanana()
    {
        Banana banana = new Banana();
        banana.setSpeed(level);
        int x = Greenfoot.getRandomNumber(400);
        int y = 0;
        addObject(banana, x, y);
    }
}

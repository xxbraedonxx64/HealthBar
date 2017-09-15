import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    //Need to add constants here

    private GreenfootImage frame;
    private GreenfootImage healthBar;

    private Color good;
    private Color warning;
    private Color danger;

    //Need to add code here

    /**
     * Default constructor for objects of the HealthBar class
     * 
     * @param There are no parameters
     * @return an object of the HealthBar type
     */
    public HealthBar()
    {
        //Need to add code

        frame.setColor( Color.GRAY );
        //frame.fillRect(0, 0, WIDTH, HEIGHT);

        good = Color.GREEN;
        warning = Color.YELLOW;
        danger = Color.RED;

        //Need to add code

        updateBar();
    }

    /**
     * Constructor for objects of the HealthBar class that allows for customization
     * 
     * @param c is the current value of health
     * @param m is the maximum health amount
     * @param s is the speed the health bar's health with change at
     * @return an object of the HealthBar type
     */
    public HealthBar(int c, int m, int s)
    {

        //Need to add code

        //frame.setColor( Color.GRAY );
        //frame.fillRect(0, 0, WIDTH, HEIGHT);

        good = Color.GREEN;
        warning = Color.YELLOW;
        danger = Color.RED;

        //Need to add code

        updateBar();
    }

    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Need to add code

        updateBar();
    }

    /**
     * updateBar updates the image of the health bar when the current health
     * changes values
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void updateBar()
    {
        //Need to add code

        //Need to add if statements

        //healthBar.clear();
        //healthBar.fillRect( 0, 0, healthWidth, HEIGHT );

        //text.clear();
        //text.setColor( Color.BLACK );
        //text.setFont( new Font( "Times New Roman", Font.PLAIN, 20 ) );
        //text.drawString(current + " / " + max, 0, HEIGHT-text.getFont().getSize()/2);

        //frame.clear();
        //frame.setColor( Color.GRAY );
        //frame.fillRect(0, 0, WIDTH, HEIGHT);
        //frame.drawImage( healthBar, 0, 0 );
        //frame.drawImage( text, WIDTH/3, 0 );

        //setImage( frame );
    }

    /**
     * add will change the current value of the health in the health bar
     * 
     * @param change is the amount that the current health will be changed by
     * @return Nothing is returned
     */
    public void add( int change )
    {
        //Need to add code
    }

    /**
     * setTarget will change the target value to whatever the user chooses
     * 
     * @param t is the new, user-chosen target value
     * @return Nothing is returned
     */
    public void setTarget( int t )
    {
        //target = t;
    }

    /**
     * setCurrent will change the current value to whatever the user chooses
     * 
     * @param c is the new, user-chosen current value
     * @return Nothing is returned
     */
    public void setCurrent( int c )
    {
        //current = c;
    }

    /**
     * setMax will change the maximum value to whatever the user chooses
     * 
     * @param m is the new, user-chosen maximum value
     * @return Nothing is returned
     */
    public void setMax( int m )
    {
        //max = m;
    }

    /**
     * setSpeed will change the speed to whatever the user chooses
     * 
     * @param s is the new, user-chosen speed
     * @return Nothing is returned
     */
    public void setSpeed( int s )
    {
        //speed = s;
    }

    /**
     * getMax returns the maximum value for use in other sections of code or for the user's information
     * 
     * @param There are no parameters
     * @return an integer representing the maximum value
     */
    public int getMax()
    {
        //Change this
        return 0;
    }

    /**
     * getCurrent returns the current health value for use in other sections of code or for the user's information
     * 
     * @param There are no parameters
     * @return an integer representing the current health value
     */
    public int getCurrent()
    {
        //Change this
        return 0;
    }

}

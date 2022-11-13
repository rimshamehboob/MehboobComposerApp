package com.Mehboob;
public class Composer
{
    private int id;
    private String name ;
    private String genre ;

    /**
     * No argument contructor
     */
    public Composer()
    {
        this.id =0;
        this.name ="";
        this.genre = "";

    }
    /**
     * Composer to create a composer with all arguments
     */
    public Composer(int id,String name,String genre)
    {
        this.id =id;
        this.name = name;
        this.genre = genre;
    }

    /**
     * Returns the composer id
     * @return int composer id
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * returns composer name
     * @return string composer name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * returns genre
     * @return String genre
     */
    public String getGenre()
    {
        return this.genre;
    }

    /**
     * Returns String representation of composer object
     */
    @Override
    public String toString() {
        
        String composerString = "ID:"+this.id +"\n"+"NAME"+this.name+"\n"+"GENRE"+this.genre+"\n";
        return composerString;
    }



}
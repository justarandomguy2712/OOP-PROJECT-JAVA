/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kma;

/**
 *
 * @author AGuyJustWantToCode
 */
public class FootballPlayer {
    private String ID;
    private String name;
    private int year;
    private String pos;

    public FootballPlayer(String ID, String name, int year, String pos) {
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.pos = pos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
    
}

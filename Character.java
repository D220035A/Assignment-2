package Assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jay
 */
import java.util.ArrayList;

class Character {
    
    private static final int BASE_HEALTH = 100;
     
    private String characterID;
    private String characterName;
    private int level;
    private int health;
    private ArrayList<Skill> skills;
    private Player player;

    public Character(String characterID, String characterName, int level) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.level = level;
        this.health = BASE_HEALTH;
        this.skills = new ArrayList<>();
        this.player = null;
    }

    public String getCharacterID() {
        return characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void levelUp() {
        level++;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }
}
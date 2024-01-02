package Assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jay
 */
class Rogue extends Character {
    private int stealthLevel;
    private String daggerType;

    public Rogue(String characterID, String characterName, int level, int stealthLevel, String daggerType) {
        super(characterID, characterName, level);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    public String getDaggerType() {
        return daggerType;
    }

    public void setStealthLevel(int stealthLevel) {
        this.stealthLevel = stealthLevel;
    }

    public void setDaggerType(String daggerType) {
        this.daggerType = daggerType;
    }

    public void stab(Character target) {
        if (getHealth() <= 0) {
            System.out.println(getCharacterName() + " can't perform the action. The character is dead.");
            return;
        }

        int damage;

        if (getLevel() >= 1 && getLevel() <= 3) {
            damage = 10;
        } else if (getLevel() >= 4 && getLevel() <= 5) {
            damage = 15;
        } else {
            damage = 20;
        }

        if (target.getHealth() - damage > 0) {
            target.setHealth(target.getHealth() - damage);
        } else {
            target.setHealth(0);
        }
    }

    public void evade() {
        if (getStealthLevel() < 5) {
            System.out.println(getCharacterName() + "'s stealth level must reach level 5 before evading attacks.");
        } else {
            System.out.println(getCharacterName() + " successfully evaded the incoming attack.");
        }
    }

    @Override
    public String toString() {
        String status = getHealth() > 0 ? "Alive" : "Dead";
        StringBuilder skillsString = new StringBuilder("Skills: ");
        for (Skill skill : getSkills()) {
            skillsString.append(skill.getSkillName()).append(", ");
        }
        if (skillsString.length() > 2) {
            skillsString.setLength(skillsString.length() - 2); // Remove the trailing ", "
        }

        return "Rogue: " +
                "\nCharacter ID: " + getCharacterID() +
                "\nName: " + getCharacterName() +
                "\nLevel: " + getLevel() +
                "\nHealth: " + getHealth() +
                "\nStealth Level: " + getStealthLevel() +
                "\nDagger Type: " + getDaggerType() +
                "\nStatus: " + status +
                "\n" + skillsString.toString() +
                "\n";
    }
}
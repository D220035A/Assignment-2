package Assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jay
 */
class Warrior extends Character {
    private String weaponType;
    private String armorType;

    public Warrior(String characterID, String characterName, int level, String weaponType, String armorType) {
        super(characterID, characterName, level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public void chargeAttack(Character target) {
        int damage = 0;

        if (getLevel() > 5) {
            switch (getWeaponType()) {
                case "Sword":
                    damage = 50;
                    break;
                case "Dagger":
                    damage = 20;
                    break;
                case "Crossbow":
                    damage = 50;
                    break;
                case "Staff":
                    damage = 10;
                    break;
            }
        } else {
            switch (getWeaponType()) {
                case "Sword":
                    damage = (int) (damage * 0.5);
                    break;
                case "Dagger":
                    damage = 20;
                    break;
                case "Crossbow":
                    damage = (int) (damage * 0.5);
                    break;
                case "Staff":
                    damage = (int) (damage * 0.5);
                    break;
            }
        }
        
        if (target.getHealth() - damage > 0) {
            target.setHealth(target.getHealth() - damage);
        } else {
            target.setHealth(0);
        }
    }

    public void shieldBlock() {
        String message;

        switch (getArmorType()) {
            case "Shield":
                message = getCharacterName() + " is raising its shield.";
                break;
            case "Gauntlet":
                message = getCharacterName() + " is raising its gauntlets.";
                break;
            case "Helmet":
                message = getCharacterName() + "'s head is protected.";
                break;
            default:
                message = getCharacterName() + " I hope you're protected...somehow.";
                break;
        }

        System.out.println(message);
    }

  
 @Override
    public String toString() {
        StringBuilder skillsString = new StringBuilder("Skills: ");
        for (Skill skill : getSkills()) {
            skillsString.append(skill.getSkillName()).append(", ");
        }
        if (skillsString.length() > 2) {
            skillsString.setLength(skillsString.length() - 2); // Remove the trailing ", "
        }

        return "Warrior: " +
                "\nCharacter ID: " + getCharacterID() +
                "\nName: " + getCharacterName() +
                "\nLevel: " + getLevel() +
                "\nHealth: " + getHealth() +
                "\nWeapon: " + getWeaponType() +
                "\nArmor: " + getArmorType() +
                "\n" + skillsString.toString() + 
                "\n";
    }
}
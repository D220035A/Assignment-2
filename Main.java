package Assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jay
 */
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("P001", "Player1");
        Player player2 = new Player("P002", "Player2");

        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, "Sword", "Chainmail");
        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, "Ice");
        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, "Shuriken");

        Skill whirlwindSlash = new Skill("Whirlwind Slash", "Powerful spinning attack with a sword.");
        Skill dualWielding = new Skill("Dual Wielding", "Ability to wield two weapons simultaneously.");
        Skill frostNova = new Skill("Frost Nova", "Unleashes a freezing explosion in the surroundings.");
        Skill lockpicking = new Skill("Lockpicking", "Skillful in opening locks.");

        gideon.addSkill(whirlwindSlash);
        gideon.addSkill(dualWielding);

        elara.addSkill(frostNova);

        darian.addSkill(lockpicking);

        player1.addCharacter(gideon);
        player1.addCharacter(elara);

        player2.addCharacter(darian);

        gideon.setPlayer(player1);
        elara.setPlayer(player1);

        darian.setPlayer(player2);

        gideon.chargeAttack(darian);
        elara.castElementalSpell("Teleportation");
        darian.stab(gideon);
        gideon.shieldBlock();
        darian.evade();

        System.out.println(gideon.toString());
        System.out.println(elara.toString());
        System.out.println(darian.toString());
    }
}
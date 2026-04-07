package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.Loot;
import main.Consumable;
import main.Weapon;

public class LootFormattingTests {

    @Test
    public void testWeaponAsCsvRow() {
        Loot sword = new Weapon("Excalibur", "Legendary", 50);
        String expected = "Weapon,Excalibur,Legendary,50";
        assertEquals(expected, sword.asCsvRecord(), "Weapon CSV format is incorrect.");
    }

    @Test
    public void testConsumableAsCsvRow() {
        Loot potion = new Consumable("Health Potion", "Common", 25);
        String expected = "Consumable,Health Potion,Common,25";
        assertEquals(expected, potion.asCsvRecord(), "Consumable CSV format is incorrect.");
    }
}
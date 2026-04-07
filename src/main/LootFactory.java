package main;

public class LootFactory {

    private static final int EXPECTED_NUM_FIELDS = 6;

    public static Loot create(String[] csvRecord) {

        // If the csvRecord is null, or doesn't have exactly
        if (csvRecord == null || csvRecord.length != EXPECTED_NUM_FIELDS) {
            return null;
        }

        String typeField = csvRecord[0].toUpperCase(); // just in case

        // Every GameEntity has these attributes.
        String name = csvRecord[1];
        String rarity = csvRecord[2];

        switch (typeField) {
            case "WEAPON":
                int damage = Integer.parseInt(csvRecord[4]);
                return new Weapon(name, rarity, damage);
            case "CONSUMABLE":
                int restoreAmount = Integer.parseInt(csvRecord[4]);
                return new Consumable(name, rarity, restoreAmount);
            default:
                // If we get here, we found an unexpected entity type!
                System.out.printf("Skipping unknown GameEntity type %s.", typeField);
                return null;
        }
    }
}

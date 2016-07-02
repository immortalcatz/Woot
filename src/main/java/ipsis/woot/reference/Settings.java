package ipsis.woot.reference;

public class Settings {

    public static class Spawner {

        public static final int DEF_SAMPLE_SIZE = 100;
        public static final int DEF_LEARN_TICKS = 40;
        public static final boolean DEF_STRICT_FACTORY_SPAWNS = false;
        public static final boolean DEF_STRICT_POWER = false;
        public static final int DEF_TIER_I_RF = 1000;
        public static final int DEF_TIER_II_RF = 2000;
        public static final int DEF_TIER_III_RF = 4000;
        public static final int DEF_BASE_MOB_COUNT = 1;
        public static final int DEF_BASE_RATE_TICKS = 16 * 20;
        public static final int DEF_TIER_I_MOB_XP_CAP = 5;
        public static final int DEF_TIER_II_MOB_XP_CAP = 20;
        public static final int DEF_TIER_III_MOB_XP_CAP = 65535;
        public static final boolean DEF_PRISM_USE_WHITELIST = false;
    }

    public static class Power {

        public static final int DEF_RATE_I_RF_TICK = 40;
        public static final int DEF_RATE_II_RF_TICK = 80;
        public static final int DEF_RATE_III_RF_TICK = 120;

        public static final int DEF_LOOTING_I_RF_TICK = 40;
        public static final int DEF_LOOTING_II_RF_TICK = 80;
        public static final int DEF_LOOTING_III_RF_TICK = 120;

        public static final int DEF_XP_I_RF_TICK = 40;
        public static final int DEF_XP_II_RF_TICK = 80;
        public static final int DEF_XP_III_RF_TICK = 120;

        public static final int DEF_MASS_I_RF_TICK = 40;
        public static final int DEF_MASS_II_RF_TICK = 80;
        public static final int DEF_MASS_III_RF_TICK = 120;

        public static final int DEF_DECAPITATE_I_RF_TICK = 40;
        public static final int DEF_DECAPITATE_II_RF_TICK = 80;
        public static final int DEF_DECAPITATE_III_RF_TICK = 120;
    }

    public static class Upgrades {

        public static final int DEF_LOOTING_I_LEVEL = 1;
        public static final int DEF_LOOTING_II_LEVEL = 2;
        public static final int DEF_LOOTING_III_LEVEL = 3;

        public static final int DEF_RATE_I_TICKS = 8 * 20;
        public static final int DEF_RATE_II_TICKS = 4 * 20;
        public static final int DEF_RATE_III_TICKS = 2 * 20;

        public static final int DEF_MASS_I_MOBS = 4;
        public static final int DEF_MASS_II_MOBS = 6;
        public static final int DEF_MASS_III_MOBS = 8;

        public static final int DEF_DECAPITATE_I_CHANCE = 20;
        public static final int DEF_DECAPITATE_II_CHANCE = 40;
        public static final int DEF_DECAPITATE_III_CHANCE = 80;

        public static final int DEF_XP_I_BOOST = 20;
        public static final int DEF_XP_II_BOOST = 40;
        public static final int DEF_XP_III_BOOST = 80;

        public static final int DEF_EFFICIENCY_I_PERCENTAGE = 15;
        public static final int DEF_EFFICIENCY_II_PERCENTAGE = 25;
        public static final int DEF_EFFICIENCY_III_PERCENTAGE = 30;
    }

    /**
     * Global settings
     */
    public static int sampleSize;
    public static int learnTicks;
    public static boolean strictFactorySpawns;
    public static boolean strictPower;
    public static int baseMobCount;
    public static int baseRateTicks;
    public static int tierIRF;
    public static int tierIIRF;
    public static int tierIIIRF;
    public static int tierIMobXpCap;
    public static int tierIIMobXpCap;
    public static int tierIIIMobXpCap;
    public static String[] prismBlacklist = new String[0];
    public static String[] prismWhitelist = new String[0];
    public static boolean usePrismWhitelist;
    public static String[] tierIMobs = new String[0];
    public static String[] tierIIMobs = new String[0];
    public static String[] tierIIIMobs = new String[0];

    /**
     * Upgrade costs per tick
     */
    public static int lootingIRfTick;
    public static int lootingIIRfTick;
    public static int lootingIIIRfTick;

    public static int rateIRfTick;
    public static int rateIIRfTick;
    public static int rateIIIRfTick;

    public static int massIRfTick;
    public static int massIIRfTick;
    public static int massIIIRfTick;

    public static int decapitateIRfTick;
    public static int decapitateIIRfTick;
    public static int decapitateIIIRfTick;

    public static int xpIRfTick;
    public static int xpIIRfTick;
    public static int xpIIIRfTick;

    /**
     * Upgrade effect
     */
    public static int lootingILevel;
    public static int lootingIILevel;
    public static int lootingIIILevel;

    public static int rateITicks;
    public static int rateIITicks;
    public static int rateIIITicks;

    public static int massIMobs;
    public static int massIIMobs;
    public static int massIIIMobs;

    public static int decapitateIChance;
    public static int decapitateIIChance;
    public static int decapitateIIIChance;

    public static int xpIBoost;
    public static int xpIIBoost;
    public static int xpIIIBoost;

    public static int efficiencyI;
    public static int efficiencyII;
    public static int efficiencyIII;
}

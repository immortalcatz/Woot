package ipsis.woot.tileentity.ng.loot;

import ipsis.woot.manager.EnumEnchantKey;
import ipsis.woot.tileentity.ng.WootMobName;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.io.File;
import java.util.List;

public interface ILootRepository {

    boolean isEmpty(WootMobName wootMobName, EnumEnchantKey key);
    boolean isFull(WootMobName wootMobName, EnumEnchantKey key);
    @Nonnull List<ItemStack> getDrops(WootMobName wootMobName, EnumEnchantKey key, int numMobs);
    void insert(WootMobName wootMobName, EnumEnchantKey key, @Nonnull List<EntityItem> drops, boolean updateSampleCount);
    void insertStatic(WootMobName wootMobName, EnumEnchantKey key, ItemStack itemStack, int dropChance);

    void loadFromFile(File file);
    void saveToFile(File file);
}

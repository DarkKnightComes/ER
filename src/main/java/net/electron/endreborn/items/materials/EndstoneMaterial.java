package net.electron.endreborn.items.materials;

import net.electron.endreborn.blocks.Blocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EndstoneMaterial implements ToolMaterial{

	@Override
	public int getDurability() {
		return 200;
	}

	@Override
	public float getMiningSpeed() {
		return 3f;
	}

	@Override
	public float getAttackDamage() {
		return 1.0f;
	}

	@Override
	public int getMiningLevel() {
		return 1;
	}

	@Override
	public int getEnchantability() {
		return 10;
	}

	@Override
	public Ingredient getRepairIngredient() {
		Ingredient repairMaterial = Ingredient.ofItems(Blocks.BURNED_END_STONE);
        return repairMaterial;
	}

}
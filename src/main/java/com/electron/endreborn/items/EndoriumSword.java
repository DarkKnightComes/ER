package com.electron.endreborn.items;

import com.electron.endreborn.EndReborn;
import com.electron.endreborn.items.materials.ModMaterials;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class EndoriumSword extends SwordItem {
	public EndoriumSword() {
		super(ModMaterials.TOOL_ENDORIUM, 3, -2.4f, new Item.Properties().group(EndReborn.ENDGROUP));
	}
}
package com.blakebr0.cucumber.inventory.slot;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SingleSlot extends SlotItemHandler {
	public SingleSlot(IItemHandler inventory, int index, int xPosition, int yPosition) {
		super(inventory, index, xPosition, yPosition);
	}

	@Override
	public int getSlotStackLimit() {
		return 1;
	}

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return 1;
	}
}

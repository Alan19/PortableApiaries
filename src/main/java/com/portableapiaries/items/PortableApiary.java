package com.portableapiaries.items;

import com.portableapiaries.ExampleMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PortableApiary extends Item {
    private final String NAME = "portableapiary";
    public PortableApiary(){
        setRegistryName(NAME);
        setUnlocalizedName(ExampleMod.MODID + "." +NAME);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}

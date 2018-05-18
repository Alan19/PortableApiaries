package com.portableapiaries;

import com.portableapiaries.items.PortableApiary;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    @GameRegistry.ObjectHolder("portableapiaries:portableapiary")
    public static PortableApiary portableApiary;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        portableApiary.initModel();
    }
}

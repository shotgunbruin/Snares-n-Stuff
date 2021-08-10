package com.io.github.shotgunbruin.snaresnstuff;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = SnaresnStuff.MODID, version = SnaresnStuff.VERSION, dependencies = "required-after:terrafirmacraftplus;")
public class SnaresnStuff
{
    public static final String MODID = "snaresnstuff";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}

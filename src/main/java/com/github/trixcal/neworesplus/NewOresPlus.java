package com.github.trixcal.neworesplus;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NewOresPlus.MODID)
public final class NewOresPlus {

    public static final String MODID = "neworesplus";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public NewOresPlus() {
        LOGGER.debug("Hello from New Ores+");
    }
}

package com.revintobi.xeos;

import org.bukkit.plugin.java.JavaPlugin;

public class xeos extends JavaPlugin {

	@Override
	public void onEnable() {
		getCommand("coinflip").setExecutor(new CoinFlipCommand());
		getCommand("test").setExecutor(new Test());
		System.out.println("Successfully enabled xeos!");
		System.out.println("XEOS-1.1-SNAPSHOT");
	}
}

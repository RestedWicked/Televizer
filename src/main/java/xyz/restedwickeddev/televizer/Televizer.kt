package xyz.restedwickeddev.televizer

import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class Televizer : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("${ChatColor.GREEN}Enabled ${this.name}")
        logger.info("${ChatColor.DARK_AQUA}______${ChatColor.LIGHT_PURPLE}___________")
        logger.info("${ChatColor.DARK_AQUA}|     \\${ChatColor.LIGHT_PURPLE}         /")
        logger.info("${ChatColor.DARK_AQUA}|      \\${ChatColor.LIGHT_PURPLE}       /")
        logger.info("${ChatColor.DARK_AQUA}|     /${ChatColor.LIGHT_PURPLE}       /")
        logger.info("${ChatColor.DARK_AQUA}|     \\${ChatColor.LIGHT_PURPLE}  /\\  /")
        logger.info("${ChatColor.DARK_AQUA}|______\\${ChatColor.LIGHT_PURPLE}/  \\/")
        logger.info("${ChatColor.DARK_AQUA}Wicked was here!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Bye Bye! :3")
        logger.info("${ChatColor.RED}Disabled ${this.name}")
    }
}

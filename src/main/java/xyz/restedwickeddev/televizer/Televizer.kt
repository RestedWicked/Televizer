package xyz.restedwickeddev.televizer

import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class Televizer : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        println(logo())
        logger.info("${ChatColor.GREEN}Enabled ${this.name}")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Bye Bye! :3")
        logger.info("${ChatColor.RED}Disabled ${this.name}")
    }
}

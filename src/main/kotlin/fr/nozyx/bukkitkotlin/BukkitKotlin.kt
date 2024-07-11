package fr.nozyx.bukkitkotlin

import org.bukkit.plugin.java.JavaPlugin

class BukkitKotlin : JavaPlugin() {
    override fun onEnable() {
        this.logger.info("BukkitKotlin started ! (Kotlin v2.0.0 | MC 1.19.4)")
    }

    override fun onDisable() {
        this.logger.info("BukkitKotlin stopping!")
    }
}
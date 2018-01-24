package br.com.seudominio.template;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static Main m;

	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Template] " + ChatColor.GREEN + "Plugin Ativado");
	}

	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Template] " + ChatColor.RED + "Plugin Desativado");
	}

	public void onLoad() {
		m = this;
		createConfig();
	}

	public void createConfig() {
		if (!getDataFolder().exists()) {
			getDataFolder().mkdirs();
		}
		File file = new File(getDataFolder(), "config.yml");
		if (!file.exists()) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Template]" + ChatColor.YELLOW + "Arquivo <config.yml> nao encontrado. Criando estrutura default.");
			saveDefaultConfig();
		} else {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Template]" + ChatColor.YELLOW + "Arquivo <config.yml> encontrado! Carregando estrutura default.");
		}
	}
}
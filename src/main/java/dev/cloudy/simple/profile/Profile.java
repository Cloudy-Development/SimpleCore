package dev.cloudy.simple.profile;

import dev.cloudy.simple.Simple;
import dev.cloudy.simple.rank.Rank;
import dev.cloudy.simple.rank.enums.EnumRanks;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.UUID;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:33
 */
@Getter
@Setter
public class Profile {
    private UUID uuid;
    private String name;
    private boolean online;
    private Rank rank;

    /**
     * Constructor for the profile class
     *
     * @param uuid the uuid of the player
     */
    public Profile(UUID uuid) {
        this.uuid = uuid;
        this.name = Bukkit.getOfflinePlayer(uuid).getName();
        this.online = false;
        this.rank = Simple.getInstance().getRankRepository().getRank(EnumRanks.DEFAULT);
    }

    /**
     * Save the profile to the config file
     */
    public void save() {
        FileConfiguration config = Simple.getInstance().getConfig();

        config.set("profiles." + this.uuid + ".name", this.name);
        config.set("profiles." + this.uuid + ".online", this.online);

        Simple.getInstance().saveConfig();

    }

    /**
     * Load the profile from the config file
     */
    public void load() {
        FileConfiguration config = Simple.getInstance().getConfig();

        this.name = config.getString("profiles." + this.uuid + ".name");
        this.online = config.getBoolean("profiles." + this.uuid + ".online");
    }
}
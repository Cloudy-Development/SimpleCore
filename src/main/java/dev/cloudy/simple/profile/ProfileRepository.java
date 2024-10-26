package dev.cloudy.simple.profile;

import dev.cloudy.simple.Simple;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:34
 */
@Getter
@Setter
public class ProfileRepository {
    private HashMap<UUID, Profile> profiles = new HashMap<>();

    public ProfileRepository() {
        this.loadExistingProfiles();
    }

    /**
     * Get the profile of a player
     *
     * @param uuid the uuid of the player
     * @return the profile of the player
     */
    public Profile getProfile(UUID uuid) {
        return this.profiles.get(uuid);
    }

    /**
     * Loads all the existing profiles from the config section and initializes them
     */
    private void loadExistingProfiles() {
        FileConfiguration config = Simple.getInstance().getConfig();

        if (config.getConfigurationSection("profiles") == null) {
            return;
        }

        config.getConfigurationSection("profiles").getKeys(false).forEach(uuid -> {
            Profile profile = new Profile(UUID.fromString(uuid));
            profile.load();
            this.profiles.put(UUID.fromString(uuid), profile);
        });
    }
}

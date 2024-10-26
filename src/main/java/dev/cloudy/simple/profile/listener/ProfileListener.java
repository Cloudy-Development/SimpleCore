package dev.cloudy.simple.profile.listener;

import dev.cloudy.simple.Simple;
import dev.cloudy.simple.profile.Profile;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:35
 */
public class ProfileListener implements Listener {

    @EventHandler
    private void onLogin(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        Profile profile = Simple.getInstance().getProfileRepository().getProfile(player.getUniqueId());

        if (profile == null) {
            profile = new Profile(player.getUniqueId());
            profile.load();
            Simple.getInstance().getProfileRepository().getProfiles().put(player.getUniqueId(), profile);
        }

        profile.setName(player.getName());
    }

    @EventHandler
    private void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Profile profile = Simple.getInstance().getProfileRepository().getProfile(player.getUniqueId());
        profile.setOnline(true);
    }

    @EventHandler
    private void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Profile profile = Simple.getInstance().getProfileRepository().getProfile(player.getUniqueId());
        profile.setOnline(false);

        profile.save();
    }
}
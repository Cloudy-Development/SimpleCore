package dev.cloudy.simple;

import dev.cloudy.simple.profile.ProfileRepository;
import dev.cloudy.simple.rank.RankRepository;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
@Setter
public class Simple extends JavaPlugin {

    @Getter
    private static Simple instance;

    private ProfileRepository profileRepository;
    private RankRepository rankRepository;

    @Override
    public void onEnable() {
        instance = this;

        this.profileRepository = new ProfileRepository();
        this.rankRepository = new RankRepository();
    }

    @Override
    public void onDisable() {

    }
}
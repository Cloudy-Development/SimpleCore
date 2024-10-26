package dev.cloudy.simple.rank;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.ChatColor;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:41
 */
@Getter
@Setter
public class Rank {
    private String name;
    private String prefix;
    private String suffix;

    private int weight;

    private ChatColor color;

    private boolean defaultRank;
    private boolean staffRank;
    private boolean donatorRank;

    /**
     * Create a new rank
     *
     * @param name the name of the rank
     */
    public Rank(String name) {
        this.name = name;
    }
}
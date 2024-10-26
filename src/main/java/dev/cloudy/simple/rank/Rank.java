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
     * Constructor for the rank class
     *
     * @param name the name of the rank
     * @param prefix the prefix of the rank
     * @param suffix the suffix of the rank
     * @param weight the weight of the rank
     * @param color the color of the rank
     * @param defaultRank if the rank is the default rank
     * @param staffRank if the rank is a staff rank
     * @param donatorRank if the rank is a donator rank
     */
    public Rank(String name, String prefix, String suffix, int weight, ChatColor color, boolean defaultRank, boolean staffRank, boolean donatorRank) {
        this.name = name;
        this.prefix = prefix;
        this.suffix = suffix;
        this.weight = weight;
        this.color = color;
        this.defaultRank = defaultRank;
        this.staffRank = staffRank;
        this.donatorRank = donatorRank;
    }
}
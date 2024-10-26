package dev.cloudy.simple.rank.enums;

import lombok.Getter;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:43
 */
@Getter
public enum EnumRanks {
    OWNER("Owner", "§7[§4Owner§7] ", "§7", 100, false, true, false),
    ADMIN("Admin", "§7[§cAdmin§7] ", "§7", 90, false, true, false),
    MODERATOR("Moderator", "§7[§2Mod§7] ", "§7", 80, false, true, false),
    HELPER("Helper", "§7[§9Helper§7] ", "§7", 70, false, true, false),
    BUILDER("Builder", "§7[§eBuilder§7] ", "§7", 60, false, true, false),
    YOUTUBER("YouTuber", "§7[§5YouTuber§7] ", "§7", 50, false, true, false),
    MVP_PLUS("MVP+", "§7[§bMVP+§7] ", "§7", 40, false, false, true),
    MVP("MVP", "§7[§bMVP§7] ", "§7", 30, false, false, true),
    VIP_PLUS("VIP+", "§7[§aVIP+§7] ", "§7", 20, false, false, true),
    VIP("VIP", "§7[§aVIP§7] ", "§7", 10, false, false, true),
    DEFAULT("Default", "§7", "§7", 0, true, false, false);

    private final String name;
    private final String prefix;
    private final String suffix;

    private final int weight;

    private final boolean defaultRank;
    private final boolean staffRank;
    private final boolean donatorRank;

    /**
     * Constructor for the ranks enum class
     *
     * @param name the name of the rank
     * @param prefix the prefix of the rank
     * @param suffix the suffix of the rank
     * @param weight the weight of the rank
     * @param defaultRank if the rank is the default rank
     * @param staffRank if the rank is a staff rank
     * @param donatorRank if the rank is a donator rank
     */
    EnumRanks(String name, String prefix, String suffix, int weight, boolean defaultRank, boolean staffRank, boolean donatorRank) {
        this.name = name;
        this.prefix = prefix;
        this.suffix = suffix;
        this.weight = weight;
        this.defaultRank = defaultRank;
        this.staffRank = staffRank;
        this.donatorRank = donatorRank;
    }
}
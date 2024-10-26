package dev.cloudy.simple.rank.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.ChatColor;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:43
 */
@Getter
@AllArgsConstructor
public enum EnumRanks {
    OWNER("Owner", "§7[§4Owner§7] ", "§7", 100, ChatColor.RED, false, true, false),
    ADMIN("Admin", "§7[§cAdmin§7] ", "§7", 90, ChatColor.RED, false, true, false),
    MODERATOR("Moderator", "§7[§2Mod§7] ", "§7", 80, ChatColor.DARK_GREEN, false, true, false),
    HELPER("Helper", "§7[§9Helper§7] ", "§7", 70, ChatColor.BLUE, false, true, false),
    BUILDER("Builder", "§7[§eBuilder§7] ", "§7", 60, ChatColor.YELLOW, false, true, false),
    YOUTUBER("YouTuber", "§7[§5YouTuber§7] ", "§7", 50, ChatColor.DARK_PURPLE, false, true, false),
    MVP_PLUS("MVP+", "§7[§bMVP+§7] ", "§7", 40, ChatColor.AQUA, false, false, true),
    MVP("MVP", "§7[§bMVP§7] ", "§7", 30, ChatColor.AQUA, false, false, true),
    VIP_PLUS("VIP+", "§7[§aVIP+§7] ", "§7", 20, ChatColor.GREEN, false, false, true),
    VIP("VIP", "§7[§aVIP§7] ", "§7", 10, ChatColor.GREEN, false, false, true),
    DEFAULT("Default", "§7", "§7", 0, ChatColor.GRAY, true, false, false);

    private final String name;
    private final String prefix;
    private final String suffix;

    private final int weight;

    private final ChatColor color;

    private final boolean defaultRank;
    private final boolean staffRank;
    private final boolean donatorRank;
}
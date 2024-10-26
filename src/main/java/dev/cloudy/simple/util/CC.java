package dev.cloudy.simple.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:31
 */
@UtilityClass
public class CC {
    /**
     * Translate the string with the color codes
     *
     * @param string the string to translate
     * @return the translated string
     */
    public String translate(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}
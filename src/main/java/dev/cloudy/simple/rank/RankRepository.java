package dev.cloudy.simple.rank;

import dev.cloudy.simple.rank.enums.EnumRanks;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Emmy
 * @project Simple
 * @date 26/10/2024 - 17:42
 */
@Getter
@Setter
public class RankRepository {
    private List<Rank> ranks = new ArrayList<>();

    public RankRepository() {
        this.loadRanks();
    }

    /**
     * Load all the ranks from the enum and initialize them
     */
    private void loadRanks() {
        Arrays.stream(EnumRanks.values()).forEach(rank ->
                this.ranks.add(new Rank(
                        rank.name(),
                        rank.getPrefix(),
                        rank.getSuffix(),
                        rank.getWeight(),
                        rank.getColor(),
                        rank.isDefaultRank(),
                        rank.isStaffRank(),
                        rank.isDonatorRank())
                )
        );
    }

    /**
     * Get the rank by the name
     *
     * @param rank the name of the rank
     * @return the rank
     */
    public Rank getRank(EnumRanks rank) {
        return this.ranks.stream().filter(r -> r.getName().equalsIgnoreCase(rank.name())).findFirst().orElse(null);
    }
}
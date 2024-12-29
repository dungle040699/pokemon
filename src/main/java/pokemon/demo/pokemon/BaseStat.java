package pokemon.demo.pokemon;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BaseStat {

    private final Integer hp;

    private final Integer attack;

    private final Integer defense;
}

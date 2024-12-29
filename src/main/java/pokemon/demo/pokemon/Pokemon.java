package pokemon.demo.pokemon;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Pokemon {

    private Integer id;

    private String name;

    private BaseStat baseStat;
}

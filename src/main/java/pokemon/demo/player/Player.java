package pokemon.demo.player;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.demo.pokemon.Pokemon;

@Getter
@Setter
@Accessors(chain = true)
public class Player {

    private Integer id;

    private String name;

    private Pokemon pokemon;
}

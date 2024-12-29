package pokemon.demo.team;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pokemon.demo.pokemon.Pokemon;

@Getter
@Setter
@Accessors(chain = true)
public class Team {

    private Integer id;

    private String name;

    private Pokemon pokemon;
}

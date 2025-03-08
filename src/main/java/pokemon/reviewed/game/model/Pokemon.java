package pokemon.reviewed.game.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Pokemon {

    private String id;

    private String name;

    private Integer hp;

    private Integer attack;
}

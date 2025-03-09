package pokemon.reviewed.render.event;

import pokemon.reviewed.game.state.BanPickState;
import pokemon.reviewed.render.domain.BanPickRender;

import java.util.List;
import java.util.Map;

public class RenderEventManager {

    private Map<BanPickState, BanPickRender> map;

    public void subscribe(BanPickState banPickState) {

        var banPickRender = map.get(banPickState);
    }
}

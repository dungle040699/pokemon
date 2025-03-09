package pokemon.reviewed.game.ban_pick.impl;

import pokemon.reviewed.game.ban_pick.BanPickService;
import pokemon.reviewed.game.factory.PokemonFactory;
import pokemon.reviewed.game.model.Game;
import pokemon.reviewed.game.model.Pokemon;
import pokemon.reviewed.game.state.BanPickState;
import pokemon.reviewed.render.domain.BanPickRender;
import pokemon.reviewed.render.service.RenderService;

import java.util.List;

public class OneVsOneBanPickService implements BanPickService {

    // show pokemon list -> choose 1 -> 2 ben chon -> combat
    private final List<Pokemon> pokemons;

    private final RenderService renderService;

    public OneVsOneBanPickService(PokemonFactory factory, RenderService renderService) {
        this.pokemons = factory.getAllPokemons();
        this.renderService = renderService;
    }

    public void getAllPokemons(Game game) {

        var banPickRender = new BanPickRender(pokemons, game);

        renderService.send(banPickRender);

        game.setBanPickState(BanPickState.INPUT_WAITING);
    }
}

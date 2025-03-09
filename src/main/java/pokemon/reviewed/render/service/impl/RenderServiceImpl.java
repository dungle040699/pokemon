package pokemon.reviewed.render.service.impl;

import pokemon.reviewed.render.domain.BanPickRender;
import pokemon.reviewed.render.service.RenderService;

public class RenderServiceImpl implements RenderService {

    @Override
    public void send(BanPickRender banPickRender) {

        var game = banPickRender.game();
        var gameState = game.getGameState();
        var banPickState = game.getBanPickState();


    }
}

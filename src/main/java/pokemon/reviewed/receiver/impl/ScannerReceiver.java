package pokemon.reviewed.receiver.impl;

import lombok.RequiredArgsConstructor;
import pokemon.reviewed.controller.Controller;
import pokemon.reviewed.game.Game;
import pokemon.reviewed.receiver.Receiver;
import pokemon.reviewed.mapper.Mapper;
import pokemon.reviewed.render.Render;

import java.util.Scanner;

@RequiredArgsConstructor
public class ScannerReceiver implements Receiver {

    private final Scanner scanner;

    private final Mapper mapper;

    private final Game game;

    private final Controller controller;

    @Override
    public Render receive() {

        var input = scanner.next();
        var gameInput = mapper.toGameInput(input);
        return controller.playGame(gameInput, game);
    }
}

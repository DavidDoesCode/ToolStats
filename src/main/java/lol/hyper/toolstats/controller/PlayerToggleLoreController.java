package lol.hyper.toolstats.controller;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerToggleLoreController {

    private static PlayerToggleLoreController instance;

    private HashMap<String, Boolean> playerAddLoreConfigs = new HashMap<>();

    public static PlayerToggleLoreController getInstance() {
        if (instance == null)
            instance = new PlayerToggleLoreController();

        return instance;
    }

    public void togglePlayer(Player player) {
        if(!playerAddLoreConfigs.containsKey(player.getName()) ||
                (playerAddLoreConfigs.get(player.getName())))
            playerAddLoreConfigs.put(player.getName(), false);
        else
            playerAddLoreConfigs.put(player.getName(), true);
    }

    public Boolean isPlayerAddLoreEnabled(Player player) {
        if(!playerAddLoreConfigs.containsKey(player.getName()) ||
                playerAddLoreConfigs.get(player.getName()))
            return true;
        else
            return false;
    }

}

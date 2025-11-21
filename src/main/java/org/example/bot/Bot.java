package org.example.bot;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.types.bot.BotCommand;

public class Bot {
    final private BotClient bot;
    final private BotCommand[] commands = {
            new BotCommand("help", "Информационное сообщение")
//            new BotCommand("") TODO дописать команды бота
    };

    public Bot(){
        String BOT_TOKEN = System.getenv("BOT_TOKEN");
        bot = new BotClient(BOT_TOKEN);

        bot.addHandler(new BotHandler());
    };

    public void execBot(){
        bot.startPolling();
    }
}

class BotHandler{

}

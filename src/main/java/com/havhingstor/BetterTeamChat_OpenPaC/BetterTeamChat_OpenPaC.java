package com.havhingstor.BetterTeamChat_OpenPaC;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import com.havhingstor.BetterTeamChat.BetterTeamChat;

@Environment(EnvType.CLIENT)
public class BetterTeamChat_OpenPaC implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BetterTeamChat.registerTeamType(new OpenParty());
    }
}

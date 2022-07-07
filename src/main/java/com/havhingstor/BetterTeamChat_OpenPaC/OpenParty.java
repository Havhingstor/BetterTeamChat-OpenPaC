package com.havhingstor.BetterTeamChat_OpenPaC;

import com.havhingstor.BetterTeamChat.BetterTeamChat;
import com.havhingstor.BetterTeamChat.chatMsgHandler.CustomTeamType;
import xaero.pac.client.api.OpenPACClientAPI;
import xaero.pac.client.parties.party.api.IClientPartyStorageAPI;

public class OpenParty implements CustomTeamType {
    @Override
    public boolean isInTeam() {
        OpenPACClientAPI api = OpenPACClientAPI.get();

        IClientPartyStorageAPI parties = api.getClientPartyStorage();

        if (parties != null) {
            return parties.getParty() != null;
        }

        return false;
    }

    @Override
    public void sendMessage(String s) {
        BetterTeamChat.sendCommand("opm " + s);
    }
}

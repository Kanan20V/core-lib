package com.example.corelib;

import com.example.corelib.client.account.AccountClient;
import com.example.corelib.client.card.CardClient;

public interface CoreFacade extends
    CardClient,
    AccountClient {
}
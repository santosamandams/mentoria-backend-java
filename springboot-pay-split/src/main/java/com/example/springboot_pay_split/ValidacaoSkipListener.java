package com.example.springboot_pay_split;

import org.springframework.batch.core.SkipListener;

public class ValidacaoSkipListener implements SkipListener<Transaction, Transaction> {

    @Override
    public void onSkipInProcess(Transaction item, Throwable t) {
        System.err.println("==> ITEM INVALIDO PULADO: ID " + item.externalId() +
                " | Motivo: " + t.getMessage());
    }

    @Override
    public void onSkipInRead(Throwable t) {
    }

    @Override
    public void onSkipInWrite(Transaction item, Throwable t) {
    }
}

package com.example.pplibrary;

import com.example.pplibrary.internal.PPOperationsImpl;

public final class Operation {
    private Operation() {

    }
    public static IOperation getInstance() {
        return new PPOperationsImpl();
    }
}

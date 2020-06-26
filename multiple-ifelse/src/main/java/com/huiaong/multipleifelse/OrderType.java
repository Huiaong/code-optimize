package com.huiaong.multipleifelse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderType {
    PURCHASE_ORDER("purchase"),
    SHOP_ORDER("shop"),
    SERVICE_ORDER("service"),
    INVOICE_ORDER("invoice"),
    RETURNED_ORDER("returned"),

    ;

    private final String name;


    OrderType of(String name) throws NoSuchFieldException {
        for (OrderType type : OrderType.values()) {
            if (type.name.equals(name)) {
                return type;
            }
        }
        throw new NoSuchFieldException("order type" + name + "not exist");
    }
}

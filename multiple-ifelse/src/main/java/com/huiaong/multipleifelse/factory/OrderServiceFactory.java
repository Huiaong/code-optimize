package com.huiaong.multipleifelse.factory;

import com.google.common.collect.Maps;
import com.huiaong.multipleifelse.IOrderService;
import com.huiaong.multipleifelse.OrderType;
import com.huiaong.multipleifelse.impl.*;

import java.util.Map;

public class OrderServiceFactory {
    private static final Map<OrderType, IOrderService> factory = Maps.newHashMap();
    static {
        factory.put(OrderType.PURCHASE_ORDER, new PurchaseOrderServiceImpl());
        factory.put(OrderType.SHOP_ORDER, new ShopOrderServiceImpl());
        factory.put(OrderType.SERVICE_ORDER, new ServiceOrderServiceImpl());
        factory.put(OrderType.INVOICE_ORDER, new InvoiceOrderServiceImpl());
        factory.put(OrderType.RETURNED_ORDER, new ReturnedOrderServiceImpl());
    }

    public static IOrderService getOrderService(OrderType type){
        return factory.get(type);
    }
}

package com.huiaong.multipleifelse;

import com.huiaong.multipleifelse.factory.OrderServiceFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceFactoryTest {

    @Test
    public void optimizeMultipleIfElse() {
        OrderServiceFactory.getOrderService(OrderType.PURCHASE_ORDER).execute();
    }

}
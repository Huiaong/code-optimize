package com.huiaong.multipleifelse.impl;

import com.huiaong.multipleifelse.IOrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShopOrderServiceImpl implements IOrderService {

    @Override
    public void execute() {
        log.info("shop order service execute");
    }
}

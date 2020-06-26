package com.huiaong.multipleifelse.impl;

import com.huiaong.multipleifelse.IOrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReturnedOrderServiceImpl implements IOrderService {

    @Override
    public void execute() {
        log.info("service order service execute");
    }
}

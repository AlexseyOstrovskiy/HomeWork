package com.mmalaenko.service.impl;

import com.mmalaenko.repository.OrderGoodRepository;
import com.mmalaenko.service.OrderGoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderGoodServiceImpl implements OrderGoodService {
    @Autowired
    private final OrderGoodRepository orderGoodRepository;

    public OrderGoodServiceImpl(OrderGoodRepository orderGoodRepository) {
        this.orderGoodRepository = orderGoodRepository;
    }

    @Override
    public void save(int orderID, int productID) {
        orderGoodRepository.save(orderID,productID);
    }
}

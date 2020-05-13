package com.eureka.icecream.service;

import com.eureka.icecream.entity.IceCream;

import java.util.Optional;

public interface IceCreamService {
    Optional<IceCream> getIceCreamById(Long id);
}

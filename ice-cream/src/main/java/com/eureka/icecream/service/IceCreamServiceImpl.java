package com.eureka.icecream.service;

import com.eureka.icecream.entity.IceCream;
import com.eureka.icecream.repository.IceCreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class IceCreamServiceImpl implements IceCreamService {

    @Autowired
    private IceCreamRepository iceCreamRepository;

    @Override
    public Optional<IceCream> getIceCreamById(Long id) {
        return iceCreamRepository.findById(id);
    }
}

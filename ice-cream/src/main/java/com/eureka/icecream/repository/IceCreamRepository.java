package com.eureka.icecream.repository;

import com.eureka.icecream.entity.IceCream;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IceCreamRepository extends JpaRepository<IceCream, Long> {
}

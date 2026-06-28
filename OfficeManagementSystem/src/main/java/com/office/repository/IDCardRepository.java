package com.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.office.entity.IDCard;

public interface IDCardRepository extends JpaRepository<IDCard, Integer> {

}
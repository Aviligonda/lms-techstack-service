package com.bridgelabz.lmstechstackservice.repository;
/*
 * Purpose : TechStackRepository Are Used to Store the Data into Database
 * Version : 1.0
 * @author : Aviligonda Sreenivasulu
 * */

import com.bridgelabz.lmstechstackservice.model.TechStackModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechStackRepository extends JpaRepository<TechStackModel, Long> {
}


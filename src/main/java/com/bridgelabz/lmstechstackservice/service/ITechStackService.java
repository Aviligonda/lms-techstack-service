package com.bridgelabz.lmstechstackservice.service;


import com.bridgelabz.lmstechstackservice.dto.TechStackDto;
import com.bridgelabz.lmstechstackservice.model.TechStackModel;

import java.util.List;
/*
 * Purpose : ITechStackService to Show The all APIs
 * Version : 1.0
 * @author : Aviligonda Sreenivasulu
 * */

public interface ITechStackService {
    TechStackModel addTechStack(TechStackDto techStackDto);

    List<TechStackModel> getAllTechStacks();

    TechStackModel updateTechStack(Long id, TechStackDto techStackDto);

    TechStackModel deleteTechStack(Long id);

}

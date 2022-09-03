package com.bridgelabz.lmstechstackservice.service;


import com.bridgelabz.lmstechstackservice.dto.TechStackDto;
import com.bridgelabz.lmstechstackservice.model.TechStackModel;
import com.bridgelabz.lmstechstackservice.util.Response;

import java.util.List;
/*
 * Purpose : ITechStackService to Show The all APIs
 * Version : 1.0
 * @author : Aviligonda Sreenivasulu
 * */

public interface ITechStackService {
    Response addTechStack(String token, TechStackDto techStackDto);

    List<TechStackModel> getAllTechStacks(String token);

    Response updateTechStack(String token, Long id, TechStackDto techStackDto);

    Response deleteTechStack(String token, Long id);

}

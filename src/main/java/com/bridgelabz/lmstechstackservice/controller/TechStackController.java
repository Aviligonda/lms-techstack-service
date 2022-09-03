package com.bridgelabz.lmstechstackservice.controller;

import com.bridgelabz.lmstechstackservice.dto.TechStackDto;
import com.bridgelabz.lmstechstackservice.model.TechStackModel;
import com.bridgelabz.lmstechstackservice.service.ITechStackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
 * Purpose : TechStackController to process TechStack Data APIs
 * Version : 1.0
 * @author : Aviligonda Sreenivasulu
 * */

@RestController
@RequestMapping("/techStack")
public class TechStackController {
    @Autowired
    ITechStackService techStackService;

    /*
     * Purpose : Create TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  token and techStackDto
     * */
    @PostMapping("/addTechStack")
    public TechStackModel addTechStack(@RequestBody TechStackDto techStackDto) {
        return techStackService.addTechStack(techStackDto);
    }

    /*
     * Purpose : Retrieve All TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  token
     * */
    @GetMapping("/getAllTechStacks")
    public List<TechStackModel> getAllTecStacks() {
        return techStackService.getAllTechStacks();
    }

    /*
     * Purpose : Update Existing TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  id,techStackDto and token
     * */
    @PutMapping("/updateTechStack/{id}")
    public TechStackModel updateTechStack(@PathVariable Long id,
                                          @RequestBody TechStackDto techStackDto
                                         ) {
        return techStackService.updateTechStack(id, techStackDto);
    }

    /*
     * Purpose : Delete Existing TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  id and token
     * */
    @DeleteMapping("/deleteTechStack/{id}")
    public TechStackModel deleteTechStack(@PathVariable Long id) {
        return techStackService.deleteTechStack(id);
    }
}

package com.bridgelabz.lmstechstackservice.service;
import com.bridgelabz.lmstechstackservice.dto.TechStackDto;
import com.bridgelabz.lmstechstackservice.exception.LMSException;
import com.bridgelabz.lmstechstackservice.model.TechStackModel;
import com.bridgelabz.lmstechstackservice.repository.TechStackRepository;
import com.bridgelabz.lmstechstackservice.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/*
 * Purpose : TechStackService to Implement the Business Logic
 * Version : 1.0
 * @author : Aviligonda Sreenivasulu
 * */
@Service
public class TechStackService implements ITechStackService {
    @Autowired
    TokenUtil tokenUtil;
    @Autowired
    TechStackRepository techStackRepository;

    /*
     * Purpose : Implement the Logic of Creating TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  token and techStackDTO
     * */
    @Override
    public TechStackModel addTechStack(TechStackDto techStackDto) {
            TechStackModel techStackModel = new TechStackModel(techStackDto);
            techStackModel.setCreatorStamp(LocalDateTime.now());
            techStackRepository.save(techStackModel);
            return techStackModel;
        }

    /*
     * Purpose : Implement the Logic of Get All TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  token
     * */
    @Override
    public List<TechStackModel> getAllTechStacks() {
            List<TechStackModel> isTechStack = techStackRepository.findAll();
            if (isTechStack.size() > 0) {
                return isTechStack;
            } else {
                throw new LMSException(400, "No TechStacks Found");
            }
        }

    /*
     * Purpose : Implement the Logic of Update TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  token,id and techStackDto
     * */
    @Override
    public TechStackModel updateTechStack(Long id, TechStackDto techStackDto) {
            Optional<TechStackModel> isTechStack = techStackRepository.findById(id);
            if (isTechStack.isPresent()) {
                isTechStack.get().setTechName(techStackDto.getTechName());
                isTechStack.get().setImagePath(techStackDto.getImagePath());
                isTechStack.get().setStatus(techStackDto.isStatus());
                isTechStack.get().setUpdateTimeStamp(LocalDateTime.now());
                techStackRepository.save(isTechStack.get());
                return isTechStack.get();
            } else {
                throw new LMSException(400, "Not found techStack with this id");
            }
        }

    /*
     * Purpose : Implement the Logic of Delete TechStack Details
     * @author : Aviligonda Sreenivasulu
     * @Param :  token and bankDetailsDTO
     * */
    @Override
    public TechStackModel deleteTechStack(Long id) {
            Optional<TechStackModel> isTechStack = techStackRepository.findById(id);
            if (isTechStack.isPresent()) {
                techStackRepository.delete(isTechStack.get());
                return isTechStack.get();
            } else {
                throw new LMSException(400, "Not found techStack with this id");
            }
        }
}

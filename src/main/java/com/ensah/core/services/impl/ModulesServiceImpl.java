package com.ensah.core.services.impl;

import com.ensah.core.bo.Module;
import com.ensah.core.dao.IModuleDao;
import com.ensah.core.services.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModulesServiceImpl implements IModuleService {


    @Autowired
    private IModuleDao moduleService;



    public List<Module> getAllModules() {

        return moduleService.getAll();
    }
}

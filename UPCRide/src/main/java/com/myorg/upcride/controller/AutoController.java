package com.myorg.upcride.controller;



import com.myorg.upcride.model.Auto;
import com.myorg.upcride.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/autos")
public class AutoController {

    private AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService){
        this.autoService = autoService;
    }

    @RequestMapping
    public List<Auto> listarAutos() throws Exception
    {
        return autoService.list();
    }

}




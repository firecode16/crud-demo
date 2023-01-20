package com.company.crud.controller;

import com.company.crud.entity.Cart;
import com.company.crud.response.Response;
import com.company.crud.service.AppCrudService;
import static com.company.crud.util.Util.OK_RESPONSE;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FireCode16
 */
@RestController
@CrossOrigin
public class AppCrudController {

    @Autowired
    private AppCrudService appService;

    @GetMapping(value = "/getData")
    public Response getLoadData() {
        List<Cart> arrCart = appService.getLoadData();
        return new Response(OK_RESPONSE, arrCart);
    }

    @PostMapping(value = "/saveData")
    public Response getSaveData() {
        return new Response(OK_RESPONSE, appService.getSaveData());
    }
}

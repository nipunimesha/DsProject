package lk.ijse.dep.rest.controller;

import lk.ijse.dep.rest.service.custom.ManageItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/v1/items" )
@CrossOrigin
@RestController
public class ItemControler {
    @Autowired
    private ManageItemService manageItemService;

}


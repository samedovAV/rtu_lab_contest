package ru.samedov.rtulabcontest.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchasesController {

    @PostMapping("/add-purchase")
    public void addPurchase(@RequestParam("id") Long id) {

    }
}

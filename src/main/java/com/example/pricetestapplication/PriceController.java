package com.example.pricetestapplication;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PriceController {

    private PriceService priceService;

    @GetMapping
    public List<Price> getMessage() {
        return priceService.findAll();
    }

    @PostMapping
    public List<Price> savePrice(@RequestBody Price price) {
        priceService.savePrice(price);
        return priceService.findAll();
    }

    @PostMapping("/update")
    public  Collection<Price> prices(@RequestBody List<Price> priceNew) {
        List<Price> oldPrice = priceService.findAll();
        return priceService.updatePrices(oldPrice,priceNew);
    }
}

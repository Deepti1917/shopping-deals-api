package com.example.shoppingdealsapi.controller;

import com.example.shoppingdealsapi.model.Deal;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/deals")
public class DealsController {

    @GetMapping("/clothing")
    public List<Deal> getAllClothingDeals() {
        List<Deal> deals = new ArrayList<>();

        deals.add(new Deal("1", "Nike", "Air Force 1 Sneakers", 8999.0, 6299.0, 30, "Myntra"));
        deals.add(new Deal("2", "Levi's", "501 Original Jeans", 4999.0, 2999.0, 40, "Amazon Fashion"));
        deals.add(new Deal("3", "Zara", "Cotton Blend T-Shirt", 1999.0, 1199.0, 40, "Zara Online"));
        deals.add(new Deal("4", "Adidas", "Originals Hoodie", 5499.0, 3299.0, 40, "Flipkart"));
        deals.add(new Deal("5", "H&M", "Slim Fit Chinos", 2499.0, 1499.0, 40, "H&M Store"));

        return deals;
    }

    @GetMapping("/clothing/brand/{brand}")
    public List<Deal> getDealsByBrand(@PathVariable String brand) {
        List<Deal> allDeals = getAllClothingDeals();
        List<Deal> filteredDeals = new ArrayList<>();

        for (Deal deal : allDeals) {
            if (deal.getBrand().toLowerCase().contains(brand.toLowerCase())) {
                filteredDeals.add(deal);
            }
        }

        return filteredDeals;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Shopping Deals API is running with Spring Boot 3.5.5!";
    }
}
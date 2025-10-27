package com.travelplanner.controller;

import com.travelplanner.model.Itinerary;
import com.travelplanner.repository.ItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itineraries")
public class ItineraryController {

    @Autowired
    private ItineraryRepository itineraryRepository;

    @GetMapping
    public List<Itinerary> getAllItineraries() {
        return itineraryRepository.findAll();
    }

    @PostMapping
    public Itinerary saveItinerary(@RequestBody Itinerary itinerary) {
        return itineraryRepository.save(itinerary);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteItinerary(@PathVariable Long id) {
        return itineraryRepository.findById(id)
                .map(itinerary -> {
                    itineraryRepository.delete(itinerary);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}


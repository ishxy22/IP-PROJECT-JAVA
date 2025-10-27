package com.travelplanner.repository;

import com.travelplanner.model.Itinerary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItineraryRepository extends JpaRepository<Itinerary, Integer> {
    // Spring Data JPA automatically provides CRUD methods like findAll(), save(), etc.
}



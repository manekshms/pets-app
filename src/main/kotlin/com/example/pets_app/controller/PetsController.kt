package com.example.pets_app.controller

import com.example.pets_app.models.Pet
import com.example.pets_app.service.PetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/pets")
@RestController
class PetsController(
    private val petService: PetService
) {

    @GetMapping("/")
    fun getPets(): List<Pet> {
        return this.petService.getPets()
    }
}
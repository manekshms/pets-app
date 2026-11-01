package com.example.pets_app.service

import com.example.pets_app.models.Pet
import org.springframework.stereotype.Service

@Service
class PetService {
    fun getPets(): List<Pet> {
        return listOf(
            Pet(1, "Buddy", com.example.pets_app.models.PetType.DOG),
            Pet(2, "Whiskers", com.example.pets_app.models.PetType.CAT),
            Pet(3, "Tweety", com.example.pets_app.models.PetType.BIRD)
        )
    }
}
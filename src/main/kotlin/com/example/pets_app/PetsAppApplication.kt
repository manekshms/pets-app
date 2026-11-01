package com.example.pets_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetsAppApplication

fun main(args: Array<String>) {
	runApplication<PetsAppApplication>(*args)
}

package com.pawga.camunda_spring_boot_starter

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableProcessApplication
@SpringBootApplication
class CamundaSpringBootStarterApplication

fun main(args: Array<String>) {
	runApplication<CamundaSpringBootStarterApplication>(*args)
}

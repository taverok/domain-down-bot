package com.taverok.domaindown

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DomainDownApplication

fun main(args: Array<String>) {
	runApplication<DomainDownApplication>(*args)
}

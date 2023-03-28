package de.pieroavola.aottest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AotTestApplication

fun main(args: Array<String>) {
  runApplication<AotTestApplication>(*args)
}

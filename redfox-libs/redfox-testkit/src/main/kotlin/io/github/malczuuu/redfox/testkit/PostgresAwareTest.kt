package io.github.malczuuu.redfox.testkit

import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.postgresql.PostgreSQLContainer

interface PostgresAwareTest {

  companion object {
    @Container
    @ServiceConnection
    @JvmField
    val postgres = PostgreSQLContainer("postgres:18.3-alpine")
  }
}

package io.github.malczuuu.redfox.flyway

import io.github.malczuuu.redfox.testkit.ContainerTest
import io.github.malczuuu.redfox.testkit.PostgresAwareTest
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@ContainerTest
@SpringBootTest(classes = [FlywayApplication::class])
class FlywayApplicationTests : PostgresAwareTest {

  @Test fun contextLoads() {}
}

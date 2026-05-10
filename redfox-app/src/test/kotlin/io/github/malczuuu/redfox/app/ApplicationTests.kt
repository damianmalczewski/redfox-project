package io.github.malczuuu.redfox.app

import io.github.malczuuu.redfox.testkit.ContainerTest
import io.github.malczuuu.redfox.testkit.PostgresAwareTest
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles(profiles = ["test"])
@ContainerTest
@SpringBootTest(classes = [Application::class])
class ApplicationTests : PostgresAwareTest {

  @Test fun contextLoads() {}
}

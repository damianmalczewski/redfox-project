package io.github.malczuuu.redfox.testkit

import org.junit.jupiter.api.Tag

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Tag(ContainerTest.TAG_NAME)
annotation class ContainerTest {

  companion object {
    /**
     * The tag name used to mark tests that require Testcontainers infrastructure. Tests annotated
     * with `@ContainerTest` will be tagged with this name, allowing them to be included or excluded
     * in test runs using JUnit's tagging and filtering features.
     */
    const val TAG_NAME = "testcontainers"
  }
}

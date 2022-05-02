package cz.inventi.kpj.kpjtesting;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * 1. Create Spring Boot Test (Integration test with the application context
 * loading) <br/>
 * 2. Provide mock instance of {@link HelloWorldService} <br/>
 * 2.1. {@link HelloWorldService#helloWorld()} return "Hello World"<br/>
 * 2.2. {@link HelloWorldService#echo(String) } returns "KPJ echo" for all
 * inputs<br/>
 * 3. Add asserts and JUnit annotations<br/>
 * 3.1. Verify the {@link HelloWorldService#helloWorld()} was called<br/>
 * 3.2. Assert the {@link KpjTesting#printEcho(String)} returns "KPJ echo"<br/>
 */

class KpjTestingApplicationTests {


  HelloWorldService helloWorldService;

  @Autowired
  KpjTesting kpjTesting;

  void testHelloWorld() {
    // given
    // Setup mock

    // when
    kpjTesting.printHelloWorld();

    // then
    // Verify the HelloWorldService#helloWorld() was called

  }

  void testPrintEcho() {
    // given
    // setup mock

    // when
    String result = kpjTesting.printEcho("KPJ echo");

    // then
    // Add assert the result is equals to "KPJ echo"

  }

}

package cz.inventi.kpj.kpjtesting;

import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

/**
 * 1. Create Spy on the {@link KpjTesting#helloWorldService} field <br/>
 * 2. Add JUnit annotations <br/>
 * 3. Verify the {@link HelloWorldServiceImpl#helloWorld()} is called <br/>
 * 4. Change behavior of {@link HelloWorldServiceImpl#echo(String)} to always
 * returns "KPJ Rulez" <br/>
 */
@MockitoSettings(strictness = Strictness.LENIENT)
public class KpjTestingTest {


  HelloWorldService helloWorldService = new HelloWorldServiceImpl();


  KpjTesting kpjTesting;

  void setUp() {
    // setup mocks for all tests
    // hint you have to use doReturn for Spy
    // Change behavior of HelloWorldServiceImpl#echo(String)
    // to always returns "KPJ Rulez"

  }

  void testPrintEcho() {
    // no given
    // when
    kpjTesting.printHelloWorld();

    // then
    // verify the HelloWorldServiceImpl#helloWorld() is called

  }

  void testPrintHelloWorld() {
    // no given
    // when
    String result = kpjTesting.printEcho("Print ECHO");

    // then
    // add assert the result equals "KPJ Rulez"

  }

  static class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String helloWorld() {
      return "Hello world";
    }

    @Override
    public String echo(String echo) {
      return echo;
    }

  }

}
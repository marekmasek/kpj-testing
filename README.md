# KPJ Testing

## [KpjTestingApplicationTests](src/test/java/cz/inventi/kpj/kpjtesting/KpjTestingApplicationTests.java)
Integration test

1. Create Spring Boot Test (Integration test with the application context
loading) 
2. Provide mock instance of `HelloWorldService`
    1. `HelloWorldService#helloWorld()` return `"Hello World"`
    2. `HelloWorldService#echo(String)` returns `"KPJ echo"` for all inputs
3. Add asserts and JUnit annotations
    1. Verify the `HelloWorldService#helloWorld()` was called
    2. Assert the `KpjTesting#printEcho(String)` returns `"KPJ echo"`


## [KpjTestingTest](src/test/java/cz/inventi/kpj/kpjtesting/KpjTestingTest.java)
Unit test

1. Create Spy on the `KpjTesting#helloWorldService` field
2. Add JUnit annotations
3. Verify the `HelloWorldServiceImpl#helloWorld()` is called
4. Change behavior of `HelloWorldServiceImpl#echo(String)` to always returns `"KPJ Rulez"`


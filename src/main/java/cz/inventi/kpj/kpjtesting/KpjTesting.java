package cz.inventi.kpj.kpjtesting;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class KpjTesting {

  private final HelloWorldService helloWorldService;

  @PostConstruct
  void init() {
    System.out.println("KpjTesting Bean created");
  }

  public String printEcho(String str) {
    String echo = helloWorldService.echo(str);
    System.out.println(echo);
    return echo;
  }

  public void printHelloWorld() {
    String helloWorld = helloWorldService.helloWorld();
    System.out.println(helloWorld);
  }
}

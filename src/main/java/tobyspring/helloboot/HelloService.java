package tobyspring.helloboot;

public interface HelloService {
    String sayHello(String name);

    default int coundOf(String name){
        return 0;
    }
}

package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

//클래스 레벨의 매핑을 찾은 후에 메쏘드 레벨을 찾음.
@RequestMapping
public class HelloController {
    //변수로 먼저 저장 하고 사용
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    //어노테이션을 넣으면 디스패쳐 서블릿이 빈을 다 뒤져서 웹 요청을 처리할 수 있는 매핑 정보를 처리 할 수 있는 클래스를 찾음
    @GetMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}

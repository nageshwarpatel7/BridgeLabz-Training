package reflection.advancedproblems.loggingProxy;

import java.lang.reflect.Proxy;

public class ReflectionDemo {

    public static void main(String[] args) {

        Greeting realObject = new GreetingImpl();

        Greeting proxyObject = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingHandler(realObject)
        );

        proxyObject.sayHello("Nageshwar");
    }
}
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld analogBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(analogBean.getMessage());
        System.out.println(bean == analogBean);
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat otherBeanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(otherBeanCat.getMessage());
        System.out.println(beanCat == otherBeanCat);
    }
}
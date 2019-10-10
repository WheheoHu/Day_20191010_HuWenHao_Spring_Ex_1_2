package NCUT.ShuMei.Client;

import NCUT.ShuMei.Service.Service;
import NCUT.ShuMei.Service.ServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Service service=(ServiceImpl) context.getBean("serviceimpl");
        service.showData();
    }
}

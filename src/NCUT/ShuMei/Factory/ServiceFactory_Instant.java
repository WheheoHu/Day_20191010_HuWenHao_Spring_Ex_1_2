package NCUT.ShuMei.Factory;

import NCUT.ShuMei.Service.Service;
import NCUT.ShuMei.Service.ServiceImpl;

public class ServiceFactory_Instant {
    public  Service getService(){
        return new ServiceImpl();
    }

}

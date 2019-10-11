package NCUT.ShuMei.Factory;

import NCUT.ShuMei.Dao.DatabaseDao;
import NCUT.ShuMei.Service.Service;
import NCUT.ShuMei.Service.ServiceImpl;

public class ServiceFactory {
    public static Service getService(){
        return new ServiceImpl();
    }

}

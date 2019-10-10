package NCUT.ShuMei.Service;

import NCUT.ShuMei.Dao.DatabaseDao;
import NCUT.ShuMei.Dao.DatabaseDaoImpl;

public class ServiceImpl implements Service {

    private DatabaseDao databaseDao = null;

    public ServiceImpl() {
        System.out.println("Service Started!");
    }

    @Override
    public void showData() {
        getDatabaseDao().showdataFromTable("book");
    }

    public DatabaseDao getDatabaseDao() {
        return databaseDao;
    }

    public void setDatabaseDao(DatabaseDao databaseDao) {
        this.databaseDao = databaseDao;
    }
}

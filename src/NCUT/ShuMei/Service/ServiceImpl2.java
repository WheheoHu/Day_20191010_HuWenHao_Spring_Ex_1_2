package NCUT.ShuMei.Service;

import NCUT.ShuMei.Dao.DatabaseDao;

public class ServiceImpl2 implements Service {

    private DatabaseDao databaseDao ;

    public ServiceImpl2(DatabaseDao databaseDao) {
        this.databaseDao = databaseDao;
        System.out.println("Service Started!");
    }

    @Override
    public void showData() {
        getDatabaseDao().showdataFromTable("book");
    }

    private DatabaseDao getDatabaseDao() {
        return databaseDao;
    }

    public void setDatabaseDao(DatabaseDao databaseDao) {
        this.databaseDao = databaseDao;
    }
}

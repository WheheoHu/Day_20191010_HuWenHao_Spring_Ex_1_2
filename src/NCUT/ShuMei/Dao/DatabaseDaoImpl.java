package NCUT.ShuMei.Dao;

import NCUT.ShuMei.tables.Book;
import NCUT.ShuMei.tables.bookMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DatabaseDaoImpl implements DatabaseDao {
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void showdataFromTable(String tableName) {

        List<Book> books = null;
        String sql = "SELECT * From ";
        books = jdbcTemplateObject.query(sql + tableName, new bookMapper());
        for (Book b : books) {
            b.display();
        }
       // System.out.println(s);
    }

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
}

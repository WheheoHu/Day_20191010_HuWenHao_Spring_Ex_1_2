package NCUT.ShuMei.tables;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class bookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book=new Book();
        book.setISBN(resultSet.getString("ISBN"));
        book.setSm(resultSet.getString("sm"));
        book.setZz(resultSet.getString("zz"));
        book.setCbs(resultSet.getString("cbs"));
        book.setJg(resultSet.getFloat("jg"));
        book.setFbl(resultSet.getInt("fbl"));
        book.setCul(resultSet.getInt("cul"));

        return book;
    }
}

package beyond.mvc.user.model.dao;

import beyond.mvc.user.model.vo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl implements UserDao {
    @Override
    public User getUserById(String userId) {
        User user = null;
        Connection connection = null;
        Statement statement = null;
//        String query = "SELECT * FROM user WHERE id='admin' AND status='Y'";
        String query = "SELECT * FROM user WHERE id=? AND status='Y'";
        ResultSet resultSet = null;


        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web", "beyond", "beyond");
//            statement = connection.createStatement();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                user = new User();
                user.setNo(resultSet.getInt("no"));
                user.setId(resultSet.getString("id"));
                user.setPassword(resultSet.getString("password"));
                user.setRole(resultSet.getString("role"));
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));
                user.setAddress(resultSet.getString("address"));
                user.setHobby(resultSet.getString("hobby"));
                user.setStatus(resultSet.getString("status"));
                user.setEnrollDate(resultSet.getDate("enroll_date"));
                user.setModifyDate(resultSet.getTimestamp("modify_date"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return user;
    }
}

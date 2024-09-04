package advancedjava2;

import java.sql.*;
/*
 * execute : 수행 후 true, false
 * executeQuery : 객체 변환 (select)
 * executeUpdate : 변환된 레코드 개수 리턴 (업데이트할 떄 사용)
 * */

public class DBDemo4 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection()
;    getPersonInfors(conn);
  }

  private static void getPersonInfors(Connection conn) throws SQLException {
    String query = "select * from person";
    PreparedStatement pstmt = conn.prepareStatement(query);

    ResultSet resultSet = pstmt.executeQuery();
    while(resultSet.next()) {
      System.out.println(resultSet.getString("name") + " " + resultSet.getString("phone") + " " + resultSet.getString("email"));
    }
    resultSet.close();
  }

  public static Connection makeConnection() {
    String url = "jdbc:mysql://localhost/javaex?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결 중");
      conn = DriverManager.getConnection(url, "root", "1234");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버 검색 오류");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
    }
    return conn;
  }
}



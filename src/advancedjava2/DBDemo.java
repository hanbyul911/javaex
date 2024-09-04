package advancedjava2;

import java.sql.*;
/*
 * execute : 수행 후 true, false
 * executeQuery : 객체 변환 (select)
 * executeUpdate : 변환된 레코드 개수 리턴 (업데이트할 떄 사용)
 * */

public class DBDemo {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    createNewPerson(conn);
  }

  private static void createNewPerson(Connection conn) throws SQLException {
    Statement stmt = conn.createStatement();
    String query;
    query = "insert into person (name, phone, email) values ('hong', '010-1111-1110', 'h@a.com')";

    // ResultSet rs = stmt.executeQuery(query);
    int rs = stmt.executeUpdate(query);
    System.out.println(rs + "개의 데이터가 추가되었습니다.");
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



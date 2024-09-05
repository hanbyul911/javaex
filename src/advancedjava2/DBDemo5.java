package advancedjava2;

import java.sql.*;
import java.util.Scanner;
/*
 * execute : 수행 후 true, false
 * executeQuery : 객체 변환 (select)
 * executeUpdate : 변환된 레코드 개수 리턴 (업데이트할 떄 사용)
 * */

public class DBDemo5 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    getPersonByPhone(conn);
  }

  private static void getPersonByPhone(Connection conn) throws SQLException {
    Scanner sc = new Scanner(System.in);
    System.out.println("조회하고 싶은 사람의 전화번호를 입력하세요.");
    String phone = sc.nextLine();
    String query = "select * from person where phone = ?";
    ResultSet rs = null;

    try {
      PreparedStatement pstmt = conn.prepareStatement(query);

      pstmt.setString(1, phone);
      rs = pstmt.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println("조회에 실패하였습니다.");
      } else {
        while (rs.next()) {
          System.out.println(rs.getString("name") + " " + rs.getString("phone") + " " + rs.getString("email"));
        }
      }
      rs.close();
    } catch (SQLException e) {
    }
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



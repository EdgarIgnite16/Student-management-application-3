package DAO;

import DTO.StudentDTO;
import DTO.UserDTO;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {
    public ArrayList<UserDTO> getData() throws Exception {
        String sql = "Select * from [dbo].[User]";
        try (
                Connection conn = new _openConnection("ASG_QlySinhVien").getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<UserDTO> listUser = new ArrayList<UserDTO>();
                while(rs.next()) {
                    UserDTO user = new UserDTO();
                    user.setUsername(rs.getString("username").trim());
                    user.setPassword(rs.getString("password").trim());
                    user.setRole(rs.getString("typeUser").trim());
                    listUser.add(user);
                }
                return listUser;
            }
        }
    }

//    public UserDTO checkLogin(String username, String password) throws Exception {
//        String sql = "Select username, password, typeUser from [User] where username = ? and password = ?";
//
//        // sử dụng try-with-resource
//        try(
//                Connection conn = new _openConnection("ASG_QlySinhVien").getConn();
//                PreparedStatement pstm = conn.prepareStatement(sql);
//                ) {
//            pstm.setString(1, username);
//            pstm.setString(2, password);
//            try(ResultSet rs = pstm.executeQuery()) {
//                if (rs.next()){
//                    UserDTO user = new UserDTO();
//                    user.setUsername(username);
//                    user.setPassword(password);
//                    user.setRole(rs.getString("typeUser"));
//                    return user; // tìm thấy người dùng thì trả về đối tượng người dùng
//                }
//            }
//        }
//        return null; // trong trường hợp không tìm thấy người dùng trong database
//    }
}

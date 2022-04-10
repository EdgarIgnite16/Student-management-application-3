package DAO;

import DTO.StudentDTO;
import DTO.UserDTO;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
    public boolean insert(StudentDTO student) throws Exception {
        String sql = "INSERT INTO [dbo].[Student] ([idStudent],[name],[email],[phoneNumber],[sex],[address],[avatar])"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";

        // sử dụng try-with-resource
        try(
                Connection conn = new _openConnection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            pstm.setString(1, student.getIdStudent());
            pstm.setString(2, student.getName());
            pstm.setString(3, student.getEmail());
            pstm.setString(4, student.getPhoneNumber());
            pstm.setInt(5, student.getSex());
            pstm.setString(6, student.getAddress());
            pstm.setBlob(7, student.getAvatar() != null ?
                    new SerialBlob(student.getAvatar()) : (Blob) null);

            return pstm.executeUpdate() > 0; // trả về số lượng các hàng bị ảnh hưởng
            // nếu executeUpdate trả về hơn 1 => query thành công
            // ngược lại => query thất bại
        }
    }

    public boolean delete(String idStudent) throws Exception {
        String sql = "delete from dbo.Student " +
                "WHERE [idStudent] = ?";

        // sử dụng try-with-resource
        try(
                Connection conn = new _openConnection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            pstm.setString(1, idStudent);
            return pstm.executeUpdate() > 0; // trả về số lượng các hàng bị ảnh hưởng
            // nếu executeUpdate trả về hơn 1 => query thành công
            // ngược lại => query thất bại
        }
    }

    public boolean update(StudentDTO student) throws Exception {
        String sql = "UPDATE dbo.Student " +
                "SET [idStudent] = ? , [name] = ?, [email] = ?," +
                "[phoneNumber] = ?, [sex] = ?, [address] = ?, [avatar] = ? " +
                "WHERE [idStudent] = ?";

        // sử dụng try-with-resource
        try(
                Connection conn = new _openConnection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            pstm.setString(8, student.getIdStudent());
            pstm.setString(1, student.getIdStudent());
            pstm.setString(2, student.getName());
            pstm.setString(3, student.getEmail());
            pstm.setString(4, student.getPhoneNumber());
            pstm.setInt(5, student.getSex());
            pstm.setString(6, student.getAddress());
            pstm.setBlob(7, student.getAvatar() != null ?
                    new SerialBlob(student.getAvatar()) : (Blob) null);

            return pstm.executeUpdate() > 0; // trả về số lượng các hàng bị ảnh hưởng
            // nếu executeUpdate trả về hơn 1 => query thành công
            // ngược lại => query thất bại
        }
    }

    public ArrayList<StudentDTO> getData() throws Exception {
        String sql = "Select * from dbo.Student";
        try (
                Connection conn = new _openConnection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
                ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<StudentDTO> listStudent = new ArrayList<StudentDTO>();
                while(rs.next()) {
                    StudentDTO student = new StudentDTO();
                    student.setIdStudent(rs.getString("idStudent").trim());
                    student.setName(rs.getString("name").trim());
                    student.setPhoneNumber(rs.getString("phoneNumber").trim());
                    student.setEmail(rs.getString("email").trim());
                    student.setAddress(rs.getString("address").trim());
                    student.setSex(rs.getInt("sex"));
                    Blob blob = rs.getBlob("avatar");
                    if(blob != null) {
                        student.setAvatar(blob.getBytes(1, (int) blob.length()));
                    }
                    listStudent.add(student);
                }
                return listStudent;
            }
        }
    }
}

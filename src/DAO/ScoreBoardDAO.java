package DAO;

import DTO.ScoreBoardDTO;
import DTO.StudentDTO;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ScoreBoardDAO {
    public boolean insert(ScoreBoardDTO scoreBoard) throws Exception {
        String sql = "INSERT INTO [dbo].[Scoreboard] ([idStudent], [Toan], [Ly], [Hoa])"
                + "VALUES(?, ?, ?, ?)";

        // sử dụng try-with-resource
        try(
                Connection conn = new _openConnection("ASG_QlySinhVien").getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            pstm.setString(1, scoreBoard.getIdStudent());
            pstm.setFloat(2, scoreBoard.getToan());
            pstm.setFloat(3, scoreBoard.getLy());
            pstm.setFloat(4, scoreBoard.getHoa());

            return pstm.executeUpdate() > 0; // trả về số lượng các hàng bị ảnh hưởng
            // nếu executeUpdate trả về hơn 1 => query thành công
            // ngược lại => query thất bại
        }
    }

    public boolean delete(String idStudent) throws Exception {
        String sql = "delete from [dbo].[Scoreboard] " +
                "WHERE [idStudent] = ?";

        // sử dụng try-with-resource
        try(
                Connection conn = new _openConnection("ASG_QlySinhVien").getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            pstm.setString(1, idStudent);
            return pstm.executeUpdate() > 0; // trả về số lượng các hàng bị ảnh hưởng
            // nếu executeUpdate trả về hơn 1 => query thành công
            // ngược lại => query thất bại
        }
    }

    public boolean update(ScoreBoardDTO scoreBoardDTO) throws Exception {
        String sql = "UPDATE [dbo].[Scoreboard] " +
                "SET [idStudent] = ? , [Toan] = ?, [Ly] = ?, [Hoa] = ? " +
                "WHERE [idStudent] = ?";

        // sử dụng try-with-resource
        try(
                Connection conn = new _openConnection("ASG_QlySinhVien").getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            pstm.setString(1, scoreBoardDTO.getIdStudent());
            pstm.setFloat(2, scoreBoardDTO.getToan());
            pstm.setFloat(3, scoreBoardDTO.getLy());
            pstm.setFloat(4, scoreBoardDTO.getHoa());
            pstm.setString(5, scoreBoardDTO.getIdStudent());

            return pstm.executeUpdate() > 0; // trả về số lượng các hàng bị ảnh hưởng
            // nếu executeUpdate trả về hơn 1 => query thành công
            // ngược lại => query thất bại
        }
    }

    public ArrayList<ScoreBoardDTO> getData() throws Exception {
        String sql = "Select * from dbo.Scoreboard";
        try (
                Connection conn = new _openConnection("ASG_QlySinhVien").getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<ScoreBoardDTO> listScoreBoard = new ArrayList<ScoreBoardDTO>();
                while(rs.next()) {
                    ScoreBoardDTO scoreBoard = new ScoreBoardDTO();
                    scoreBoard.setIdResult(rs.getString("idResult").trim());
                    scoreBoard.setIdStudent(rs.getString("idStudent").trim());
                    scoreBoard.setToan(rs.getFloat("Toan"));
                    scoreBoard.setLy(rs.getFloat("Ly"));
                    scoreBoard.setHoa(rs.getFloat("Hoa"));
                    listScoreBoard.add(scoreBoard);
                }
                return listScoreBoard;
            }
        }
    }
}

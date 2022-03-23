package BUS;

import DAO.ScoreBoardDAO;
import DTO.ScoreBoardDTO;

import java.util.ArrayList;

public class ScoreBoardBUS {
    private ArrayList<ScoreBoardDTO> listScoreBoard;

    public ScoreBoardBUS() {
        try {
            listScoreBoard = new ScoreBoardDAO().getData();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<ScoreBoardDTO> getListScoreBoard() throws Exception {
        return listScoreBoard;
    }

    public ScoreBoardDTO getScoreboardById(String id) {
        try {
            for(ScoreBoardDTO item : listScoreBoard) {
                if (item.getIdStudent().equals(id)) {
                    return item; // item là kiểu ScoreBoardDTO
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getAVGScore(ScoreBoardDTO scoreBoard) {
        float result = (scoreBoard.getToan() + scoreBoard.getLy() + scoreBoard.getHoa())/3;
        return String.format("%.2f", result);
    }
}

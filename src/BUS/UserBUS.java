package BUS;

import DAO.UserDAO;
import DTO.UserDTO;
import GUI.LoginDialogGUI;

import java.util.ArrayList;

public class UserBUS {
    private ArrayList<UserDTO> listUser;
    private LoginDialogGUI parentForm;

    public UserBUS() {
        try {
            this.listUser = new UserDAO().getData();
        } catch (Exception ex) {
            ex.printStackTrace();
             _MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Error");
        }
    }

    public UserDTO getUserLogin(String username, String password) {
        for(UserDTO user : listUser) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

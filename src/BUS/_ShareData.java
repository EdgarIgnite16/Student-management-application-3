package BUS;

import DTO.UserDTO;
import GUI.ScorceManagePanelGUI;
import GUI.StudentManagePanelGUI;

public class _ShareData {

    // Trong Java, từ khóa static được sử dụng để quản lý bộ nhớ tốt hơn
    // và nó có thể được truy cập trực tiếp thông qua lớp mà không cần khởi tạo.

    public static UserDTO userLogin;

    public static String getUsername() {
        return userLogin.getUsername();
    }

    public static String getTypeUser() {
        return userLogin.getRole();
    }
}

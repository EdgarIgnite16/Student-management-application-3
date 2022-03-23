package BUS;

import javax.swing.*;
import java.awt.*;

public class _DataValidator {

    // hàm xử lí validata của text field nhập xuất
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage) {
        if(field.getText().equals("")) {
            sb.append(String.format("%s\n", errorMessage));
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    // hàm xử lí validata của text area nhập xuất
    public static void validateEmpty(JTextArea field, StringBuilder sb, String errorMessage) {
        if(field.getText().equals("")) {
            sb.append(String.format("%s\n", errorMessage));
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    // hàm xử lí validata của group button nhập xuất
    public static void validateEmpty(ButtonGroup field, StringBuilder sb, String errorMessage) {
        if(field.getSelection() == null) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }
}

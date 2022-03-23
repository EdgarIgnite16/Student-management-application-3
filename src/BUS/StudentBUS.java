package BUS;

import DAO.StudentDAO;
import DTO.StudentDTO;

import java.util.ArrayList;

public class StudentBUS {
    private ArrayList<StudentDTO> listStudent;

    public StudentBUS() {
        try {
            listStudent = new StudentDAO().getData();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<StudentDTO> getListStudent() throws Exception {
        return listStudent;
    }

    public StudentDTO getStudentById(String id) {
        try {
            for(StudentDTO item : listStudent) {
                if (item.getIdStudent().equals(id)) {
                    return item;
                }
            }
         } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getNameStudent(String idStudent) {
        String name = null;
        try {
            for(StudentDTO item : listStudent) {
                if(item.getIdStudent().equals(idStudent)) {
                    name = item.getName();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return name;
    }
}

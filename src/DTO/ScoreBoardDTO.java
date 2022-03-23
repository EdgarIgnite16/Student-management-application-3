package DTO;

public class ScoreBoardDTO {
    private String idResult;
    private String idStudent;
    private float Toan;
    private float Ly;
    private float Hoa;

    public ScoreBoardDTO() {
    }

    public ScoreBoardDTO(String idResult, String idStudent, float toan, float ly, float hoa) {
        this.idResult = idResult;
        this.idStudent = idStudent;
        Toan = toan;
        Ly = ly;
        Hoa = hoa;
    }

    public String getIdResult() {
        return idResult;
    }

    public void setIdResult(String idResult) {
        this.idResult = idResult;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float toan) {
        Toan = toan;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float ly) {
        Ly = ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float hoa) {
        Hoa = hoa;
    }

    @Override
    public String toString() {
        return "ScoreBoardDTO{" +
                "idResult='" + idResult + '\'' +
                ", idStudent='" + idStudent + '\'' +
                ", Toan=" + Toan +
                ", Ly=" + Ly +
                ", Hoa=" + Hoa +
                '}';
    }
}

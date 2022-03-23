package DTO;

public class UserDTO {
    private String username;
    private String password;
    private String typeUser;

    public UserDTO() {
    }

    public UserDTO(String username, String password, String typeUser) {
        this.username = username;
        this.password = password;
        this.typeUser = typeUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return typeUser;
    }

    public void setRole(String typeUser) {
        this.typeUser = typeUser;
    }
}

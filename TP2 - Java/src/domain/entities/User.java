package domain.entities;

public class User {
  private final String id;
  private String login;
  private String password;
  private UserPermissions userPermissions;

  public User(String id, String login, String password, UserPermissions userPermissions) {
    this.id = id;
    this.login = login;
    this.password = password;
    this.userPermissions = userPermissions;
  }

  public String getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserPermissions getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(UserPermissions userPermissions) {
    this.userPermissions = userPermissions;
  }
}

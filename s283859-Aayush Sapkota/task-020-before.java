
class User {
  private String name;
  private int level;
  private int levelCheckpoint;

  public User() {}

  public void setName(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }


  public void setLevel(int level) {
    this.level = level;
  }

  public int getLevel(){
    return this.level;
  }


  public void setLevelCheckpoint(int levelCheckpoint) {
    this.levelCheckpoint = levelCheckpoint;
  }

  public int getLevelCheckpoint(){
    return this.levelCheckpoint;
  }
}

public class MainClass {
    public static void main(String[] args) {
        ArrayList<User> userStates = new ArrayList();

        //user plays the game set the name and details
        User user = new User();
        user.setName("Aayush Sapkota");
        user.setLevel(1);
        user.levelCheckpoint(1);

        userStates.add(user);

        userStates.get(0);
    }
}

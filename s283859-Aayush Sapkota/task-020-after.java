class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public Memento save() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }
    public void restore(Memento m) {
        state = m.getState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}

class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }


    public Memento getMemento(int i) {
        return mementos.get(i);
    }
}

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
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        User user = new User();
        JsonObject userState = new JsonObject();


        //user plays the game set the name and details
        user.setName("Aayush Sapkota");
        user.setLevel(1);
        user.levelCheckpoint(1);

        String stateString = generateUserStateString(userState, user);
        //set the state to userState
        originator.setState(stateString);
        caretaker.addMemento( originator.save() );

        //user plays the game set the name and details
        user.setLevel(1);
        user.levelCheckpoint(2);

        stateString = generateUserStateString(userState, user);
        originator.setState(stateString);
        caretaker.addMemento( originator.save() );

        //get the moment you want to restore and then restore the state saved
        //in the momento
        originator.restore( caretaker.getMemento(i) );
    }

    generateUserStateString(userState, user){
      userState.addProperty("Name", user.name);
      userState.addProperty("level", user.getLevel.toString())
      userState.addProperty("levelCheckpoint", user.getLevelCheckpoint.toString());

      return userState;
    }
}

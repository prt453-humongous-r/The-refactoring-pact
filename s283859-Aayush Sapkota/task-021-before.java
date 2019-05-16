abstract class Worker {

  public Worker() {

  }

  public void DailyRoutine() {

    getUp();

    eatBreakfast();

    gotToWork();

    work();

    returnToHome();

    relax();

    sleep();
  }

  public void getUp() {
  }

  public void eatBreakfast() {
  }

  public void gotToWork() {
  }

  public void work() {
  }

  public void returnToHome() {
  }

  public void relax() {
  }

  public void sleep() {
  }

}


public class LumberJack extends Worker {

  @Override
  public void work(){
    super.work();
    System.out.println("Cut trees");
  }
}


public class FireFighter extends Worker {

  public FireFighter(){

  }

  @Override
  public void work(){
    super.work();
    System.out.println("Save People lives from fire");
  }

}


public class Manager extends Worker {

  @Override
  public void work(){
    super.work();
    System.out.println("Assign task and verify process");
    System.out.println("Monitor rosters and address team members problems");
  }

  public void Relax(){
    super.relax();
    System.out.println("Relax on work time and slack off");

  }
}


public class Postman extends Worker {

  @Override
  public void work(){
    super.work();
    System.out.println("Deliver letters");
  }

}

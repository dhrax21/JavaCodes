package immutableClass;

public class Database {


  private static Database dbObject;
  private Database(){

  }
  public static Database getInstance(){
      if(dbObject==null){
          dbObject=new Database();
      }
      return dbObject;
  }

  public void getSingleton(){
      System.out.println("You are now connected to the database");
  }


}

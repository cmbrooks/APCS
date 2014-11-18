public class QSM {

  public static void main (String[] args) {
    String queue = "";
    String nextState = "INIT";
    int trigger = 0;


    while (nextState != "quit") {
      switch (nextState) {
        case "INIT":
          System.out.println("The init case ran");
          queue += "IDLE*";
          break;
        case "IDLE":
          System.out.println("The idle case ran");
          if (trigger == 0) {
            queue += "FUNCTION1*";
          } else if (trigger == 2) {
            queue += "FUNCTION2*";
          } else {
            queue += "EXIT*";
          }
          break;
        case "FUNCTION1":
          System.out.println("The funcion1 case ran");
          trigger = 2;
          queue += "IDLE*";
          break;
        case "FUNCTION2":
          System.out.println("The funciton2 case has ran");
          break;
        case "EXIT":
          System.out.println("The program will exit");
          break;
        default:
          queue += "EXIT*";
          break;
      }

      if (queue.indexOf("*") != -1) {
        /*
        Takes the next string from the que (from the begining of
        the string to the asterisk)
        */
        nextState = queue.substring(0, queue.indexOf("*"));
        /*Removes the next state from the queue*/
        queue = queue.substring((nextState.length() + 1), queue.length());
      } else {
        nextState = "quit";
      }

    }

    System.out.println("The exit case executed, and the QSM was exited");

  }

}

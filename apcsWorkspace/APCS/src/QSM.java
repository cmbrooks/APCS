public class QSM {

  public enum stateList {
    INIT,
    IDLE,
    FUNCTION1,
    FUNCTION2,
    EXIT
  }

  public static void main (String[] args) {
    String queue = "";
    String nextState = "INIT";
    int trigger = 0;


    while (nextState != EXIT) {
      switch (nextState)) {
        case INIT:
          System.out.println("The init case ran");
          queue += "IDLE*";
        case IDLE:
          System.out.println("The idle case ran");
          if (trigger == 0) {
            queue += "FUNCTION1*";
          } else if (trigger == 2) {
            queue += "FUNCTION2*";
          } else {
            queue += "EXIT*";
          }
        case FUNCTION1:
          System.out.println();
          trigger = 2;
          queue += "IDLE*";
        case FUNCTION2:
          System.out.println("The funciton2 case has ran");
          break
        case EXIT:
          System.out.println("The program will exit");
          break;
        default:
          queue += "EXIT*";
      }

      /*
      Takes the next string from the que (from the begining of
      the string to the asterisk)
      */
      nextState = stateList.valueOf( queue.substring( 0, queue.intexOf("*") ) );
      /*Removes the next state from the queue*/
      queue = queue.substring( (nextState.length() + 1), queue.length() );

    }

    System.out.println("The exit case executed, and the QSM was exited");

}

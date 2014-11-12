/*
Cody Brooks
2014-11-11
*/

public class USPresidentNames {

  /** All U.S. Presidents. */
  private static String[] lastNames = {
    "Washington",
    "Adams",
    "Jefferson",
    "Madison",
    "Monroe",
    "Adams",
    "Jackson",
    "Buren",
    "Harrison",
    "Tyler",
    "Polk",
    "Fillmore",
    "Pierce",
    "Buchanan",
    "Lincoln",
    "Johnson",
    "Grant",
    "Hayes",
    "Garfield",
    "Arthur",
    "Cleveland",
    "Harrison",
    "Cleveland",
    "McKinley",
    "Roosevelt",
    "Taft",
    "Wilson",
    "Harding",
    "Coolidge",
    "Hoover",
    "Roosevelt",
    "Truman",
    "Eisenhower",
    "Kennedy",
    "Johnson",
    "Nixon",
    "Ford",
    "Carter",
    "Reagan",
    "Bush",
    "Clinton",
    "Bush",
    "Obama"
  };

  /** Get a copy of the last names. */
  public static String[] getLastNames() {

    // The clone() method is inherited from the super class java.lang.Object
    // It makes a copy of the lastNames
    return lastNames.clone();
  }
}

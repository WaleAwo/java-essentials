package basics.java;

    /*

    An enum is a special "class" that represents a group of constants.
    To create an enum, use the "enum" keyword (instead of class or interface), and separate the constants with a comma.
    Note that they should be in uppercase letters.

    Enums can be included within a class and are often used in switch statements.

    You can loop through an Enum using the values() method:

    for (Level myVar : Level.values()) {
        System.out.println(myVar);
    }

     */

public enum EnumConstants {

    LONG_WAIT,
    SHORT_WAIT
}

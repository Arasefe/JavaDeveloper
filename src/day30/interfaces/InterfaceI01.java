package day30.interfaces;
/*
Interface is a device or system that unrelated entities use to interact.
Interfaces cannot be instantiated directly.
An interface is not required to have any methods.
An interface can not be marked as final.
All top-level interfaces are assumed to have public or default access.
Marking an interface as private, protected, or final will trigger a compiler error.
All non-default methods in an interface are assumed to have the modifiers *abstract* and *public* in their definition.
Marking a method as private, protected, or final will trigger compiler errors as these are
incompatible with the abstract and public keywords.

 */
public interface InterfaceI01 {
    // All variables in Interface is by default public, static and final
    public int x=1;
    public static int y=3;
    public static final int z=5;

    char c='A';
    // All non-default methods in Interface is by default public, abstract
    void add(int x, int y);
    abstract void divide(int x, int y);
    public abstract void multiply(int x, int y);

    default void product(int x, int y){
        System.out.println("Result: "+x+y);
    }


}

package Overriding;



public class Sandbox {

    private static class Parent {
        public ParentReturnType run() {
            return new ParentReturnType();
        }
    }

    private static class ParentReturnType {

    }

    private static class Child extends Parent {
        @Override
        public ChildReturnType run() {
            return new ChildReturnType();
        }
    }

    private static class ChildReturnType extends ParentReturnType {
    }
}
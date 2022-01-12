package test;

public abstract class ACourse {
    protected final void makeCourse() {
        makePPT();
        makeVideo();
    }
    final void makePPT() {
        System.out.println("ppt");
    }
    abstract void makeVideo();
}

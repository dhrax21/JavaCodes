package immutableClass;

public final class ImmutableClassExam {

     final int marks;

     final String name;

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public ImmutableClassExam(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

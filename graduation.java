import java.util.Scanner;

class Student {
    /**
     * the Student's Full name
     */
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID) {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    /**
     * Return the full name of this student.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String newName) {
        this.name = newName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID() {
        return this.id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints) {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits() {
        return this.credits;
    }

    /**
     * Return the login name of this student. The login name is a combination of the
     * first four characters of the student's name and the first three characters of
     * the student's ID number.
     */
    public void yetgraduate() {
        String res = this.credits < 132 ? "Not Yet Graduated" : "Graduated";
        System.out.println(res);
    }

    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(this.name + " (" + this.id + ")");
    }
}

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.print("Enter the student ID: ");
        String id = sc.nextLine();
        Student s = new Student(name, id);

        s.print();
        System.out.print("Enter newname if you want to change name else enter -1: ");
        String newName = sc.nextLine();
        if (!newName.equals("-1"))
            s.changeName(newName);
        System.out.print("Enter additional points for the student: ");
        int additionalPoints = sc.nextInt();
        s.addCredits(additionalPoints);
        s.yetgraduate();
        s.print();
    }
}

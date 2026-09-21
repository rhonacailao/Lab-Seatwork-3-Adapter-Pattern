// Target Interface
interface SchoolManagementApp {
    void integrateSystem();
}

// Adaptee
class AttendanceSystem {
    public void markAttendance() {
        System.out.println("Marking attendance..");
    }
}

class GradingSystem {
    public void recordGrades() {
        System.out.println("Recording grades..");
    }
}

class LibrarySystem {
    public void manageBooks() {
        System.out.println("Managing books..");
    }
}

// Adapter
class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem = new AttendanceSystem();

    @Override
    public void integrateSystem() {
        attendanceSystem.markAttendance();
    }
}

class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem = new LibrarySystem();

    @Override
    public void integrateSystem() {
        librarySystem.manageBooks();
    }
}

class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem = new GradingSystem();

    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}

// Client Code
public class App {
    public static void clientCode(SchoolManagementApp system) {
        system.integrateSystem();
    }

    public static void main(String[] args) {
        // Using the Adapter
        AttendanceSystemAdapter attendanceSystem = new AttendanceSystemAdapter();
        clientCode(attendanceSystem);

        LibrarySystemAdapter librarySystem = new LibrarySystemAdapter();
        clientCode(librarySystem);

        GradingSystemAdapter gradingSystem = new GradingSystemAdapter();
        clientCode(gradingSystem);
    }
}
package sg.edu.rp.c346.id22015131.p05_mymodules;

public class Module {
    private String moduleCode;
    private String moduleName;
    private int moduleYear;
    private int moduleSemester;
    private int moduleCredit;
    private String moduleVenue;

    public Module(String moduleCode, String moduleName, int academicYear, int academicSemester, int moduleCredit, String moduleVenue) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.moduleYear = academicYear;
        this.moduleSemester = academicSemester;
        this.moduleCredit = moduleCredit;
        this.moduleVenue = moduleVenue;
    }

    public String getModuleCode() {
        return moduleCode;
    }
    public String display() {
        String message = "Module Code: " + moduleCode;
        message += "\nModule Name: " + moduleName;
        message += "\nAcademic Year: " + moduleYear;
        message += "\nSemester: " + moduleSemester;
        message += "\nModule Credit: " + moduleCredit;
        message += "\nVenue: " + moduleVenue;
        return message;
    }

}

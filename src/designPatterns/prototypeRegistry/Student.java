package designPatterns.prototypeRegistry;

public class Student{
    private String batchName;
    private double avgBatchPsp;
    private String instructorName;
    private String monthOfEnrollment;
    private String currentModule;
    private String name;
    private String phoneNumber;
    private String email;

    public Student(String batchName){
        this.batchName = batchName;
    }

    public Student(){

    }

    public Student copy(){
        Student student = new Student();
        student.batchName = this.batchName;
        student.avgBatchPsp = this.avgBatchPsp;
        student.instructorName = this.instructorName;
        student.monthOfEnrollment = this.monthOfEnrollment;
        student.currentModule = this.currentModule;
        return s;
    }

    public String getBatchName() {
        return batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }

    public String getCurrentModule() {
        return currentModule;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
    }

    public void setCurrentModule(String currentModule) {
        this.currentModule = currentModule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
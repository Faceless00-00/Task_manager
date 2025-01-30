package classes;

public class Task {
    private int id;
    private String title;
    private String description;
    private String deadline;
    private String priority;
    private String status;

    public Task(int id, String title, String description, String deadline, String priority, String status){
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void printAllData(){
        System.out.print("Id: " + this.id + " Title: " + this.title + " Description: " + this.description + " Deadline: " + this.deadline + " Priority: " + this.priority + " Status: " + this.status);
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

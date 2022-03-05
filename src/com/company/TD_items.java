package com.company;


public class TD_items {
    private String title;
    private String description;
    private String priority;

    public TD_items(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String display(){
        String text;
        text = this.getTitle()+ " | Description: " + this.getDescription() + " | Priority: " + this.getPriority();
        return text;
    }
}

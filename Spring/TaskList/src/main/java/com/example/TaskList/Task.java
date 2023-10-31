package com.example.TaskList;


public class Task {

    private Long id;
    private String description;

    // costruttore vuoto
    public Task() {
		
	}
    //costruttore pieno
    public Task(Long id, String description){
        this.id = id;
        this.description = description;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}


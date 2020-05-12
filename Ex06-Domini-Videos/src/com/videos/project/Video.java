package com.videos.project;

import java.util.ArrayList;
import java.util.List;

public class Video {

	private String title = "";
	private String URL = "";
	private List<String> tags = new ArrayList<String>();
	
	public Video(String title, String uRL, List<String> tags) {
		super();
		this.title = title;
		URL = uRL;
		this.tags = tags;
	}

	public Video(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return 	"Title: " + this.title + "\n" +
				"URL: " + this.URL + "\n" + 
				"Tags: " + this.tags.toString();
	}
	
}

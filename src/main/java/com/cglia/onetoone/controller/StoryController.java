package com.cglia.onetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.onetoone.model.Story;
import com.cglia.onetoone.service.StoryService;

@RestController
@RequestMapping("/stories")
public class StoryController {
	@Autowired
	private StoryService storyService;

	@GetMapping
	public List<Story> getAllStories() {
		return storyService.getAllStories();
	}

	@PostMapping
	public Story createStory(@RequestBody Story story) {
		return storyService.createStory(story);
	}

	@GetMapping("/{id}")
	public Story getStoryById(@PathVariable Long id) {
		return storyService.getStoryById(id);
	}

	@PutMapping("/{id}")
	public void updateStory(@PathVariable Long id, @RequestBody Story story) {
		Story existingStory = storyService.getStoryById(id);
		if (existingStory != null) {
			story.setId(id);
			storyService.updateStory(story);
		}
	}

	@DeleteMapping("/{id}")
	public void deleteStory(@PathVariable Long id) {
		storyService.deleteStory(id);
	}
}

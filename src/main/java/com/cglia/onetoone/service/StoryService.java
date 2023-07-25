package com.cglia.onetoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.onetoone.model.Story;
import com.cglia.onetoone.repository.StoryRepository;

@Service
public class StoryService {
	@Autowired
	private StoryRepository storyRepository;

	public List<Story> getAllStories() {
		return storyRepository.findAll();
	}

	public Story createStory(Story story) {
		return storyRepository.save(story);
	}

	public Story getStoryById(Long storyId) {
		return storyRepository.findById(storyId).orElse(null);
	}

	public void updateStory(Story story) {
		storyRepository.save(story);
	}

	public void deleteStory(Long storyId) {
		storyRepository.deleteById(storyId);
	}
}

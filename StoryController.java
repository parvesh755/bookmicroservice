package com.sca.bookmicroservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sca.bookmicroservice.entity.Story;
import com.sca.bookmicroservice.repository.StoryRepository;

@RestController
@RequestMapping(value = "/story")
public class StoryController {
	
    @Autowired
    StoryRepository storyRepository;
    
    @ResponseBody
    @RequestMapping(value = "/stories")
    public List<Story> getBookDetails() {
        List<Story> storyresponse = (List<Story>) storyRepository.findAll();
        return storyresponse;
    }
}
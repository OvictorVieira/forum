package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicDTO;
import br.com.alura.forum.model.Course;
import br.com.alura.forum.model.Topic;
import br.com.alura.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class TopicsController {

    @Autowired
    private TopicRepository topicRepository;

    @RequestMapping("/topics")
    public List<TopicDTO> list() {
        List<Topic> topics = topicRepository.findAll();

        return TopicDTO.convertToArrayOfTopicDTO(topics);
    }
}

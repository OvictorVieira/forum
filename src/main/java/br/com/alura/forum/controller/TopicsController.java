package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicDTO;
import br.com.alura.forum.model.Course;
import br.com.alura.forum.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class TopicsController {

    @RequestMapping("/topics")
    public List<TopicDTO> list() {
        Topic topic = new Topic(
                "Dúvida",
                "Dúvida com Spring Boot",
                new Course("Spring", "Programação")
        );

        return TopicDTO.convertToArrayOfTopicDTO(Arrays.asList(topic, topic, topic));
    }
}

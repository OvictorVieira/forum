package br.com.alura.forum.controller;

import br.com.alura.forum.model.Course;
import br.com.alura.forum.model.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Arrays;

@Controller
public class TopicsController {

    @RequestMapping("/topics")
    @ResponseBody
    public List<Topic> list() {
        Topic topic = new Topic(
                "Dúvida",
                "Dúvida com Spring Boot",
                new Course("Spring", "Programação")
        );

        return Arrays.asList(topic, topic, topic);
    }
}

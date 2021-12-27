package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Topic;

import java.util.List;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class TopicDTO {
    private final Long id;
    private final String title;
    private final String message;
    private final LocalDateTime creationDate;

    public TopicDTO(Topic topic) {
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.creationDate = topic.getCreationDate();
    }

    public static List<TopicDTO> convertToArrayOfTopicDTO(List<Topic> topics) {
        return topics.stream().map(TopicDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}

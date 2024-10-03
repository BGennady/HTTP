package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

//cоздадаем класс, в который будем преобразовывать json post в java post
public class Post {

    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    // Конструктор без параметров
    public Post() {
    }

    public Post(
            @JsonProperty String id,
            @JsonProperty String text,
            @JsonProperty String type,
            @JsonProperty String user,
            @JsonProperty Integer upvotes
    ) {
        this.upvotes = upvotes;
        this.user = user;
        this.type = type;
        this.text = text;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}

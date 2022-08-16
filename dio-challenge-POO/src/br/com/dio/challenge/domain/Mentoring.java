package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private String title;
    private String description;
    private LocalDate date;

    @Override
    public double calculateXp() {
        return XP_PATTERN + 20d;
    }

    public Mentoring() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}

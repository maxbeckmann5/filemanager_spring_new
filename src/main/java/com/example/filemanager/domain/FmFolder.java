package com.example.filemanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
public class FmFolder {

    @Id
    @NotBlank(message = "Name is required")
    private String path_foldername;


    @NotNull (message = "create date is required")
    private LocalDateTime created;


    public FmFolder() {
    }

    public FmFolder(String path_foldername, LocalDateTime created) {
        this.path_foldername = path_foldername;
        this.created = created;
    }

    public String getPath_foldername() {
        return path_foldername;
    }

    public void setPath_foldername(String path_foldername) {
        this.path_foldername = path_foldername;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "path_foldername=" + path_foldername +
                ", created=" + created +
                '}';
    }
}
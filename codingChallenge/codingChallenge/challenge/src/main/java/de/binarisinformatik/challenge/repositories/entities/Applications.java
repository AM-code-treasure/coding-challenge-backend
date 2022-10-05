package de.binarisinformatik.challenge.repositories.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Applications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "eMail is mandatory")
    private String eMail;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "employmentMode is mandatory")
    private String githubUser;

    public Applications() {
    }

    public Applications(Long id, String eMail, String name, String githubUser) {
        this.id = id;
        this.eMail = eMail;
        this.name = name;
        this.githubUser = githubUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubUser() {
        return githubUser;
    }

    public void setGithubUser(String githubUser) {
        this.githubUser = githubUser;
    }
}
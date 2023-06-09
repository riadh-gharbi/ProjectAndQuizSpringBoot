package com.example.testfileupload.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Project {
  @Id
  private Long id;

  private String name;

  private float maxMarks;


  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public float getMaxMarks() {
    return maxMarks;
  }

  public void setMaxMarks(float maxMarks) {
    this.maxMarks = maxMarks;
  }

  private String description;

  @ManyToOne(cascade = CascadeType.DETACH)
  @JoinColumn(name = "teacher_id")
  private User user;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private Set<ProjectFile> projectFiles = new LinkedHashSet<>();




  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<ProjectFile> getProjectFiles() {
    return projectFiles;
  }

  public void setProjectFiles(Set<ProjectFile> projectFiles) {
    this.projectFiles = projectFiles;
  }

  public void addProjectFile(ProjectFile p )
  {
    projectFiles.add(p);
  }

  public void removeProjectFile(ProjectFile p)
  {
    projectFiles.remove(p);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Project project = (Project) o;
    return Float.compare(project.maxMarks, maxMarks) == 0 && id.equals(project.id) && name.equals(project.name) && Objects.equals(description, project.description) && user.equals(project.user) && Objects.equals(projectFiles, project.projectFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, maxMarks, description, user, projectFiles);
  }

}

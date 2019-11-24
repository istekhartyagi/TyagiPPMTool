/**
 * 
 */
package com.tyagi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyagi.domain.Project;
import com.tyagi.exceptions.ProjectIdException;
import com.tyagi.repositories.ProjectRepository;

/**
 * @author ityagi
 *
 */
@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		}catch (Exception e) {
			throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' is already exists! ");
		}
	}
	
	public Project findProjectByIdentifier(String projectId) {
		
		//return projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		if(project == null) {
			throw new ProjectIdException("Project ID '"+projectId+"' does not exists! ");
		}
		return project;

	}
	
	public Iterable<Project> findAllProjects(){
		return projectRepository.findAll();
	}
	
	public void deleteProjectByIdentifier(String projectId) {
		Project project = projectRepository.findByProjectIdentifier(projectId);
		if(project == null) {
			throw new ProjectIdException("You can't delete project because Project ID '"+projectId+"' does not exists! ");
		}
		projectRepository.delete(project);
	}

}

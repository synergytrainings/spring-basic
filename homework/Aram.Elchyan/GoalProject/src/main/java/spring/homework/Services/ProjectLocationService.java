package spring.homework.Services;

import spring.homework.Entities.Project;
import spring.homework.Entities.ProjectLocation;
import spring.homework.Entities.Sector;

import java.util.List;

/**
 * Created by Aram on 7/23/2015.
 */
public interface ProjectLocationService extends Service<ProjectLocation> {

    public List<ProjectLocation> findByProject(Project project);

    public ProjectLocation findBySector(Sector sector);
}

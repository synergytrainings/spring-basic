package spring.homework.Services;

import spring.homework.Entities.ProjectLocation;
import spring.homework.Entities.Sector;

import java.util.List;

/**
 * Created by Aram on 7/23/2015.
 */
public interface SectorService extends Service<Sector> {
    public Sector findByProjectLocation(ProjectLocation projectLocation);
}

package org.gradle.help;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelpPropertiesPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("createProFile", HelpPropertiesTask.class, (task) -> {
            task.setProject(project);
            task.setBuildDir(project.getBuildDir());
        });
    }
}

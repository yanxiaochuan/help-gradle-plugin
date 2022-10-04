package org.gradle.help;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 *  该插件会在指定目录生成一个properties文件，该文件存储了gradle项目的所有配置信息
 */
public class HelpPropertiesPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("createProFile", HelpPropertiesTask.class, (task) -> {

        });
    }
}

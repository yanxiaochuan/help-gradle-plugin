package org.gradle.help;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HelpPropertiesTask extends DefaultTask {

    private Project project;

    private File buildDir;

    public void setBuildDir(File buildDir) {
        this.buildDir = buildDir;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @TaskAction
    public void createHelpProperties() {
        File touch = creatProFile();
        List<String> contents = new ArrayList<>();
        Map<String, ?> properties = project.getProperties();
        for (Map.Entry<String, ?> p : properties.entrySet()) {
            contents.add(p.getKey() + "=" + p.getValue());
        }
        writeHelpPro(contents, touch);
    }

    private void writeHelpPro(List<String> contents, File touch) {
        FileUtil.writeLines(contents, touch, CharsetUtil.UTF_8, false);
    }

    private File creatProFile() {
        // 创建文件
        return FileUtil.touch(new File(buildDir, "help/help_pro.properties"));
    }

}

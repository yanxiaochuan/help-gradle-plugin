# help-gradle-plugin Gradle Plugin

The help-gradle-plugin Gradle plugin is gradle help enhance

## Usage
__Execution:__
```bash
gradle createProFile
```

__Output CycloneDX Generation Info:__
```bash
gradle createProFile -info
```

__build.gradle__ (excerpt)
```groovy
plugins {
    id 'org.gradle.help.properties'
}

apply plugin: 'java'
apply plugin: 'maven'

repositories {
    mavenCentral()
}
```

a properties is generated, it will reside at `./build/help/help_pro.properties`



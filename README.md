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
buildscript {
    repositories {
        maven { url "https://plugins.gradle.org/m2/" }
    }
    dependencies {
        classpath "org.gradle.help:help-gradle-plugin:1.0.0"
    }
}
apply plugin: 'org.gradle.help.properties'
```

a properties is generated, it will reside at `./build/help/help_pro.properties`



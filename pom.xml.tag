<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <packaging>pom</packaging>
    <modules>
        <module>pet-clinic-data</module>
        <module>pet-clinic-web</module>
    </modules>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.4.RELEASE</version>
        <relativePath /> <!-- lookup parent from repository -->
    </parent>

    <groupId>com.springProject</groupId>
    <artifactId>pet-clinic</artifactId>
    <version>0.0.1</version>
    <name>pet-clinic</name>
    <description>Pet Clinic Spring Project</description>

    <properties>
        <java.version>11</java.version>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-release-plugin</artifactId>
                <version>2.2.2</version>
                <configuration>
                    <checkModificationExcludes>
                        <checkModificationExclude>file_1</checkModificationExclude>
                        <checkModificationExclude>dir_1/file_2</checkModificationExclude>
                    </checkModificationExcludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <scm>
        <developerConnection>scm:git:git@github.com:omerbegovic/Pet-Clinic.git</developerConnection>
    </scm>

</project>

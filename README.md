properties-maven-plugin
=======================

properties-maven-plugin


This is a fork from properties-maven-plugin



Sample usage:
```
<plugin>
   <groupId>com.github.cemo</groupId>
   <artifactId>properties-maven-plugin</artifactId>
   <version>1.0.0</version>
   <executions>
      <execution>
         <phase>generate-sources</phase>
         <goals>
            <goal>write-custom-properties</goal>
         </goals>
         <configuration>
            <outputFile>${project.build.outputDirectory}/META-INF/build.properties</outputFile>
            <properties>
               <property>
                  <name>Application-Name</name>
                  <value>${project.build.finalName}</value>
               </property>
               <property>
                  <name>Application.version</name>
                  <value>${project.version}</value>
               </property>
               <property>
                  <name>Application-Build-Timestamp</name>
                  <value>${maven.build.timestamp}</value>
               </property>
               <property>
                  <name>Hudson-Build-Number</name>
                  <value>${BUILD_NUMBER}</value>
               </property>
               <property>
                  <name>Hudson-Job-Name</name>
                  <value>${JOB_NAME}</value>
               </property>
               <property>
                  <name>Hudson-Build-Tag</name>
                  <value>${BUILD_TAG}</value>
               </property>
               <property>
                  <name>Hudson-Java-Home</name>
                  <value>${JAVA_HOME}</value>
               </property>
               <property>
                  <name>Hudson-Svn-Revision</name>
                  <value>${SVN_REVISION}</value>
               </property>
            </properties>
         </configuration>
      </execution>
   </executions>
</plugin>
```

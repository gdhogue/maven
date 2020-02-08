pipeline {
    agent any
    
    tools {
        jdk 'jdk8'
        maven 'maven.latest'
    }
    
    stages {
    	stage('Maven Validate') {
	       steps {
       	    echo 'validate the project is correct and all necessary information is available'
       	    sh 'mvn -B validate'
       		}
	    }
        stage('Maven Compile') {
           steps {
               echo 'compile the source code of the project'
               sh 'mvn -B -compile'
           }
        }
        stage('Maven Test') {
           steps {
               echo 'test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed'
               sh 'mvn -B test'
           }
        }
        stage('Maven Package') {
           steps {
               echo 'take the compiled code and package it in its distributable format, such as a JAR'
               sh 'mvn -B package'
           }
        }
        stage('Maven Verify') {
           steps {
               echo 'run any checks on results of integration tests to ensure quality criteria are met'
               sh 'mvn -B verify'
           }
        }
        stage('Maven Install') {
           steps {
               echo 'install the package into the local repository, for use as a dependency in other projects locally'
               sh 'mvn -B install'
           }
        }
        stage('Maven Deploy') {
           steps {
               echo 'done in the build environment, copies the final package to the remote repository for sharing with other developers and projects'
               sh 'mvn -B clean deploy'
           }
        }
    }
}
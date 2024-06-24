#!/usr/bin/env groovy

// vars/dpTest.groovy

def call() {
        dependencyCheck additionalArguments: ''' 
                    -o './'
                    -s './'
                    -f 'ALL' 
                    --prettyPrint''', odcInstallation: 'dependencyCheck'
        
        dependencyCheckPublisher pattern: 'dependency-check-report.xml'
      }

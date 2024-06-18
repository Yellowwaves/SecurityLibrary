#!/usr/bin/env groovy

// vars/gitTest.groovy

def call() {
    echo 'Testing secrets with Gitleaks'
    sh 'gitleaks detect -v -r git_report.json'
}
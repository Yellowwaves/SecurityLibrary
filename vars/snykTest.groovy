#!/usr/bin/env groovy

// vars/snykTest.groovy

def call() {
    echo 'Testing...'
    snykSecurity(
        snykInstallation: 'snyksec',
        snykTokenId: 'snyk-api-key',
        targetFile: 'snyk_report.json'
    )
}
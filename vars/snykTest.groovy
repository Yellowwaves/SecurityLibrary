#!/usr/bin/env groovy

// vars/snykTest.groovy

def call() {
    echo 'Testing...'
    snykSecurity(
        snykInstallation: 'snyksec',
        snykTokenId: 'snyk-api-key',
        additionalArguments: '--json',
    )
}
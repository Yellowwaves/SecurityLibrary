#!/usr/bin/env groovy

def call() {
    stage('Snyk test') {
        steps {
            echo 'Testing...'
            snykSecurity(
                snykInstallation: 'snyksec',
                snykTokenId: 'snyk-api-key'
            )
        }
    }
}
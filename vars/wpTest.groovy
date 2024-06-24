#!/usr/bin/env groovy

// vars/wpTest.groovy

def call(String url, String token) {
    echo 'WordPress Scan'
    sh "wpscan --url ${url} -o wp_report.json -f json --api-token ${token}"
}
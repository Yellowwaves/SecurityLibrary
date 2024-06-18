#!/usr/bin/env groovy

// vars/wpTest.groovy

def call(String url) {
    $url=${url}
    echo 'WordPress Scan'
    sh 'wpscan --url $url -o wp_report.json -f json'
}
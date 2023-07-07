pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                // Get some code from a GitHub repository
                git url: 'https://github.com/v484816/MyRepo2', branch: 'master'
                
            }
        }
        stage('Functional Test - HCL OneTest Performance') {
            steps {
                step([$class: 'PerformanceTesterProductHelper', configfile: 'C:\\Users\\vibhanshmanoj.chavh\\HCL\\hclonetest\\New folder\\MYPROJECT\\my-config.txt', duration: '', exportlog: '', exportstatreportlist: '', exportstats: '', exportstatsformat: '', exportstatshtml: '', history: '', imsharedloc: '', labels: '', name: 'MYPROJECT', overridermlabels: '', overwrite: 'true', project: '', publish: '', publish_for: '', publishreports: '', rate: '', results: '', suite: '', swapdatasets: '', usercomments: '', users: '', varfile: '', vmargs: '', workspace: ''])

            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

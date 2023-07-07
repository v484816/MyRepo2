pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                // Get some code from a GitHub repository
                git url: 'https://github.com/shasmita999/Jenkins_GIT.git', branch: 'main'
                
            }
        }
        stage('Functional Test - HCL OneTest UI') {
            steps {
                echo("************************** Functional Test - HCL OneTest UI Start **************************")
                step([$class: 'PerformanceTesterProductHelper', configfile: 'C:\\Users\\vibhanshmanoj.chavh\\HCL\\hclonetest\\New folder\\MYPROJECT\\my-config.txt', duration: '', exportlog: '', exportstatreportlist: '', exportstats: '', exportstatsformat: '', exportstatshtml: '', history: '', imsharedloc: '', labels: '', name: 'MYPROJECT', overridermlabels: '', overwrite: 'true', project: '', publish: '', publish_for: '', publishreports: '', rate: '', results: '', suite: '', swapdatasets: '', usercomments: '', users: '', varfile: '', vmargs: '', workspace: ''])
                echo("************************** Functional Test - HCL OneTest UI End **************************")

            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}



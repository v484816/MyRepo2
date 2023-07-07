pipeline {
    agent any
stages{
    stage('Functional Test - HCL OneTest UI')

 

            {

 

              steps

 

                {

 

                   step([$class: 'PerformanceTesterProductHelper', configfile: 'C:\\Users\\vibhanshmanoj.chavh\\HCL\\hclonetest\\New folder\\MYPROJECT\\my-config.txt', duration: '', exportlog: '', exportstatreportlist: '', exportstats: '', exportstatsformat: '', exportstatshtml: '', history: '', imsharedloc: '', labels: '', name: 'MYPROJECT', overridermlabels: '', overwrite: 'true', project: '', publish: '', publish_for: '', publishreports: '', rate: '', results: '', suite: '', swapdatasets: '', usercomments: '', users: '', varfile: '', vmargs: '', workspace: ''])

 

                }

 

            }      
    }
}
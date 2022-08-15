pipeline {
    agent any
        stages {
            stage ('BUILD'){
                steps {
                    echo "this is a basic pipeline"
                }
            }
            stage ('DEPLOY'){
                steps {
                    sh '''
                    pwd
                    ls
                    echo "to check deploy stage"
                    date
                    timedatectl
                    '''
                }
            } 
            stage ('TESTING'){
                steps {
                    sh echo "to check the testing stage"
                }
            }
        }
}
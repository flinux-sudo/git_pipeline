package in.groovy_writing_pipeline_scripts

    node{

        stage('Build'){

            step{
                println(" running build stage")
            }
        }
        stage('Test'){

                println("running test stage")
        }
        stage('Deploy'){

                println("running deploy stage")
        }

    }
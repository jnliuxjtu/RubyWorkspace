node{
    stage('build'){git 'https://github.com/jnliuxjtu/homework-jenkinspipeline-frontend'}
    stage('test'){echo 'testing'
	echo 'successful'
    }
    stage('deploy'){sh 'scp -r dist vagrant@192.168.33.11:/etc/nginx/index/'}
}

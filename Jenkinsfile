node{
    stage('update'){git 'https://github.com/jnliuxjtu/homework-jenkinspipeline-frontend'}
    stage('deploy'){sh 'scp -r dist vagrant@192.168.33.11:/etc/nginx/index/'}
}

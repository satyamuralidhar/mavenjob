def call(String username,String imagename,String imagetag){
    sh """
    docker rmi -f ${imagename}${imagetag}
    docker rmi -f ${username}/${imagename}:${imagetag}
    """
}
def call(String username,String imagename,String imagetag){
    sh """
    docker scan ${username}/${imagename}:${imagetag} --file=Dockerfile
    synk container test ${username}/${imagename}:${imagetag} --file=Dockerfile
    """
}
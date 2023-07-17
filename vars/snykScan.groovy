def call(String username,String imagetag,String imagename){
    sh """
    docker scan ${username}/${imagename}:${imagetag} --file=Dockerfile
    synk container test ${username}/${imagename}:${imagetag} --file=Dockerfile
    """
}
def call(String username,String imagename,String imagetag){
    sh """
    docker build -t ${imagename}${imagetag} .
    docker tag ${imagename}:${imagetag} ${username}/${imagename}:${imagetag}
    """
}
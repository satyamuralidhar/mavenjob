def call(String username,String imagetag,String imagename){
    sh """
    docker build -t ${imagename}${imagetag} .
    docker tag ${imagename}:${imagetag} ${username}/${imagename}:${imagetag}
    """
}